package array.multi;

import java.util.Scanner;

public class ArcheryScore {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][9];
		int[] sum = new int[3];
		int max = 0;
		int archer = 0;

		// 각 선수별로 과녁 점수를 입력받아 배열에 저장

		System.out.println("양궁 선수 점수 입력");
		for (int idx = 0; idx < score.length; idx++) {
			for (int idx2 = 0; idx2 < score[idx].length; idx2++) {
				System.out.printf("%d번 선수 점수입력 (%d / 9) %n", idx + 1, idx2 + 1);
				score[idx][idx2] = scan.nextInt();
			}
		} // end insert score for
		scan.close();

		for (int idx = 0; idx < score.length; idx++) {
			for (int idx2 = 0; idx2 < score[idx].length; idx2++) {
				sum[idx] = sum[idx] + score[idx][idx2];
			}
		} // end max for

		
		for (int idx = 0; idx < score.length; idx++) {
			if (sum[idx] > max) {
				max = sum[idx];
				archer = idx;
			}
		} // end max for
		System.out.printf("최고의 선수는 %d 점을 받은 ", max);
		System.out.printf("%d번 선수입니다.", archer+1);
		

	}

}
