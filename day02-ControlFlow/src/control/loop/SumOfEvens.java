package control.loop;


public class SumOfEvens {
	public static void main(String[] args) {
		// 1. 선언
		int number = 0;
		int total = 0;
		int count = 0;
		double average = 0;
		
		// 3. 사용
		while(number < 100) {
			number += 2;
			total += number;
			count++;			
		}//end while
		
		average = total/count;
		
		System.out.printf("1~100 짝수의 합 = %d%n", total);
		System.out.printf("count = %d%n", count);
		System.out.printf("평균  = %f%n", average);
			
	}
}
