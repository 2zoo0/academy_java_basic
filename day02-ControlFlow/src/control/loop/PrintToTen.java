package control.loop;
/**
 * 1 ~ 10 까지 출력하는 클래스
 * while 구문을 사용하여
 * 반복 출력으로 구현한다
 * 
 * @author Lee
 *
 */
public class PrintToTen {

	public static void main(String[] args) {
		// 1. 선언, 2 . 초기화
		int number = 0;
		
		// 3 . 사용
		while(number < 10) {
			number ++;
			System.out.printf("number = %d%n",number);
		}// end while
		
	} // end main

} // end class
