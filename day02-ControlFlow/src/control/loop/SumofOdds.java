package control.loop;
/**
 * 1에서 100 사이의 홀수의 합을 구하는 클래스
 * 
 * while 구문을 활용
 * 
 * @author Lee
 *
 */
public class SumofOdds {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		// 1 ~ 100 까지 증가시킬 값을 저장하는 변수 선언
		int number = 1;
		int sum = 0;
		
		// 3. 사용		
		while(number <100) {
			sum += number;
			number += 2;				
		}// end while
		System.out.printf("1~100 사이에 있는 홀수의 합은 %d%n",sum);
		
		// 다른 풀이
		
		number = 1;
		sum = 0;
		
		while(number <100) {
			if((number%2) != 0) 
				sum = sum + number;
			number++;
		}// end while
		System.out.printf("1~100 사이에 있는 홀수의 합은 %d",sum);
	} // end main

}// end class
