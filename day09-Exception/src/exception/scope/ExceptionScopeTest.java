package exception.scope;

public class ExceptionScopeTest {

	public static void main(String[] args) {
		// 선언
		ExceptionScope demo;
		
		// 초기화
		demo = new ExceptionScope();
		
		// 사용
		System.out.println("main 메소드가 시작되었습니다.");
		
		demo.level1();
		
		System.out.println("main 메소드가 종료되었습니다.");
	}

}
