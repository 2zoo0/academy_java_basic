package operator.unay;

/**
 * 단항연산자 : 증감연산자(++, --)를 테스트하는 클래스 
 * 증감연산자의 위치에 따른 값의 변화를 확인
 * ----------------------------------------
 * 변수 앞에 쓰이면 증가된 값이 결과로 사용되며
 * 변수 뒤에 쓰이면 증가되기 전의 값이 결과로 사용됨.
 * @author Lee
 *
 */
public class PrePost {

	public static void main(String[] args) {
		// 1. 선언 	2. 초기화
			int cnt = 0;
		
		// 3. 사용
			System.out.print(" cnt  : " + cnt);
			System.out.println(", ++cnt : " + ++cnt);
			System.out.print(" cnt  : " + cnt);
			System.out.println(", cnt++ : " + cnt++);
			System.out.print(" cnt  : " + cnt);
			System.out.println(", --cnt : " + --cnt);
			System.out.print(" cnt  : " + cnt);
			System.out.println(", cnt-- : " + cnt--);
			System.out.println(" cnt  : " + cnt);
	}

}
