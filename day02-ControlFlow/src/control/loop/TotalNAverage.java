package control.loop;

import java.util.Scanner;

public class TotalNAverage {

	public static void main(String[] args) {
		// 1. 선언
		int total = 0;
		int score = 0;
		int count = 0;
		double average;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력(끝내려면 0 입력)");
		score = scan.nextInt();
		while(score!=0) {
			total += score;
			score = scan.nextInt();
			count++;
		}//end while
		
		if(count == 0) {
			System.out.println("입력된 값이 없습니다.");
		}else{
			average = total/count;
			System.out.printf("총점 : %d%n", total);
			System.out.printf("평균 : %5.2f", average);
		} // end if

	}

}
