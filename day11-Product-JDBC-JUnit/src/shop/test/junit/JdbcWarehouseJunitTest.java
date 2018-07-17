package shop.test.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JdbcWarehouse 클래스를 작성하며
 * 하나의 메소드를 만들때마다 각 메소드를 유낫 태스트 진행하도록
 * 테스트 케이스를 만드는 Junit 테스트 클래스
 * @author PC38207
 *
 */
class JdbcWarehouseJunitTest {

	// 테스트 클래스 실행시 최초 한번만 실행되는 메소드
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	// 테스트 클래스 실행 종료 전 한번만 실행되는 메소드
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	// 각각의 @Test메소드 실행 전 항상 1번씩 실행
	@BeforeEach
	void setUp() throws Exception {
	}

	// 각각의 @Test메소드 실행 후 항상 1번씩 실행
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
