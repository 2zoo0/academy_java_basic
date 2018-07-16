package jdbc.stmt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * SCOTT 계정의 EMP 데이블의 내용을 조회하여
 * 데이터베이스 접속을 테스트하는 클래스
 */

public class PreparedDqlTest {

	private static final String URL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private static final String USER = "scott";
	private static final String PASSWORD = "tiger";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	
	
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// 1. 드라이버 로드 : 방법 1: 클래스를 바로 메모리에 로드
		Class.forName(DRIVER);
		
		// 2. 커넥션 맺기
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
		// 3. 쿼리 준비 : empno 의 값을 변경해가며 1명의 정보를 조회
		System.out.println("입력할 직원의 사번을 숫자 4자로 입력");
		Scanner scan = new Scanner(System.in);
		int eno = scan.nextInt();
		scan.close();
		System.out.println("입력할 직원의 이름입력");
		Scanner scan2 = new Scanner(System.in);
		String ename = scan2.nextLine();
		
		String sql = "INSERT INTO emp (EMPNO, ENAME)"
				+ " VALUES (?, ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		// 4. 쿼리 실행
		// 매핑하는 단계 추가
		pstmt.setInt(1, eno);
		pstmt.setString(2, ename);
		
		int insertCnt = pstmt.executeUpdate();
		
		
		// 5. 결과 처리
		
		if (insertCnt > 0) {
			System.out.println(insertCnt + "행이 입력되었습니다.");
		}
		
		
		
		// 6. 자원 해제
		// 순서 : 오픈한 반대 순서
		// pstmt -> conn
		if (pstmt != null) {
			pstmt.close();
		}
		if (conn != null) {
			conn.close();
		}
		
	}

}
