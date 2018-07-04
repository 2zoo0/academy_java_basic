package type.primitive;

/**
 * 자바의 유일한 논리형 값 : boolean
 * 저장될 수 있는 값 : true / false
 * 
 * boolean 타입을 테스트 해보는 클래스이다.
 * @author Lee
 *
 */
/**
 * 멤버변수의 초기화 순서
 * 
 * 클래스변수  기본값 -> 클래스변수의 명시적 초기화 -> 클래스 초기화 블럭의 클래스변수 초기화
 * -> (객체 생성) -> 인스턴스 변수 기본값 -> 인스턴스 변수의 명시적 초기화 
 * -> 인스턴스 초기화 블럭 -> 생성자
 */
public class BooleanTest {

	public static void main(String[] args) {
		// 1. 선언 : 타입 변수이름; 
		/* 멤버변수는 초기화를 하지 않아도
		       자동으로 초기화 되지만 지역변수는 그렇지 않다 */
		boolean flag;
		
		// 2. 초기화 : true 값 할당(저장)
		flag = true;
		
		// 3. 사용 : flag 변수의 값 출력
		//sysout cntl + F11
		System.out.println("boolean flag = " + flag);
		
		
	}

}
