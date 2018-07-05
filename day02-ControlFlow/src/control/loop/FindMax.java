package control.loop;

import java.util.Scanner;

public class FindMax {
	public static void main(String[] args) {
		// 1. 선언
		int input;
		int max = 0;

		Scanner scan = new Scanner(System.in);
		// 2. 초기화

		System.out.println("양수를 입력 (끝내려면 0입력)");
		input = scan.nextInt();

		// 3. 사용
		do {
			System.out.println("양수를 입력 (끝내려면 0입력)");
			input = scan.nextInt();

			if (input > max) {
				max = input;
			}

		} while (input > 0); // end do-while
		scan.close();
		System.out.printf("최댓값은 %d 입니다.", max);
	}
}
