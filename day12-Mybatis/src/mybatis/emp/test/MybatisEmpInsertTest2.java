package mybatis.emp.test;

import static mybatis.emp.client.MybatisClient.getFactory;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.mapper.EmpMapper;
import mybatis.emp.vo.Emp;

/**
 * 조회조건 1개 사번으로 조회
 * @author PC38207
 *
 */
public class MybatisEmpInsertTest2 {

	public static void main(String[] args) {
		
		// 0. sqlSession Factory 생성
		SqlSessionFactory factory = getFactory();
		
		// 1. sqlSession 얻기
		// dml 작업 할 땐 세션 오픈할 때
		// 자바에서 commit이 이루어지도록 해야함
		// jdbc는 기본 오토커밋이나 mysql에선 제공하지않아서 변경해야함
		
		//openSession() 메소드의 매개변수로 true를 전송해야 오토 커밋이 활성화
		SqlSession session = factory.openSession(true);
		
		try {
			// 2. 세션 객체를 통해서 쿼리 실행
		
			Emp emp = new Emp();
			emp.setEmpno(1651);
			emp.setEname("허균");
			emp.setJob("소설가");
			
			// 매퍼 인터페이스 객체를 선언
			EmpMapper mapper;
			
			// session 으로 부터 매퍼 객체를 얻어냄
			mapper = session.getMapper(EmpMapper.class);
			
			// 매퍼 인터페이스 객체를 통하여 메소드 호출
			int addCnt = session.insert("mybatis.emp.mapper.EmpMapper.insert", emp);
			System.out.println(addCnt + "개 행 입력");
			
		} finally {
			// 3. sqlSession 닫기
			session.close();
		}
		
	}

}
