package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * SCOTT 계정의 EMP 데이블의 내용을 조회하여
 * 데이터베이스 접속을 테스트하는 클래스
 */

public class DriverLoadType5 {

	private static final String URL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private static final String USER = "scott";
	private static final String PASSWORD = "tiger";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	
	
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// 1. 드라이버 로드 : 방법 1: 클래스를 바로 메모리에 로드
		Class.forName(DRIVER);
		
		// 2. 커넥션 맺기
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
		// 3. 쿼리 준비
		String sql = "SELECT empno as \"이엠피엔오\" "
				   + "     , ename"
				   + "	   , deptno"
				   + "  FROM emp"
				   + " ORDER BY ename";
		
		java.sql.Statement stmt = conn.createStatement();
		
		// 4. 쿼리 실행
		
		ResultSet result = stmt.executeQuery(sql);
		
		// 5. 결과 처리
		ResultSetMetaData meta = result.getMetaData();
		String empnoCol = meta.getColumnName(1);
		String enameCol = meta.getColumnName(2);
		
		System.out.printf("%6s | %7s |%nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ%n", empnoCol, enameCol);
		
		while (result.next()) {
			int empno = result.getInt(1);
			String ename = result.getString(2);
			System.out.printf("%6d | %7s | %d%n"
					,empno, ename, result.getInt(3));
			
		}
		
		// 6. 자원 해제
		// 순서 : 오픈한 반대 순서
		// result => stmt -> conn
		if (result != null) {
			result.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (conn != null) {
			conn.close();
		}
		
	}

}
