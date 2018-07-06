package array.multi;

import java.util.Scanner;

public class BestPitcher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[][] ERA = new double[3][5];
		double min = 10.0;
		int teamnum = 0, pnum = 0;
		// 각 침별로 각 투수의 방어율을 입력받아 배열에 저장한다. 
		
		System.out.println("1선반 2선발 3선발 4선발 5선발 방어율 입력");
		for (int idx = 0; idx < ERA.length; idx++) {
			for (int idx2 = 0; idx2 < ERA[idx].length; idx2++) {
				System.out.printf("%d 번 팀의 %d번 투수의 방어율을 입력하세요. %n", idx+1, idx2+1);
				ERA[idx][idx2] = scan.nextDouble();
			}
		} //end insert for
		scan.close();
		
		for (int idx = 0; idx < ERA.length; idx++) {
			for (int idx2 = 0; idx2 < ERA[idx].length; idx2++) {
				if(ERA[idx][idx2] < min) {
					min = ERA[idx][idx2];
					teamnum = idx;
					pnum = idx2;
				}
			}
		} //end min for 
		
		System.out.printf("최고의 투수는 방어율 %3.2f(을)를 가진 %d번팀 %d번 선수입니다."
				, min, teamnum+1, pnum+1);
		
	}

}
