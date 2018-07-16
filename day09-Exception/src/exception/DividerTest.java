package exception;

import java.util.Scanner;

public class DividerTest {

	public static void main(String[] args) {
		// 선언
		Scanner scan;
		int input;
		Divider div;
		
		// 초기화
		scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		input = scan.nextInt();
		
		div = new Divider();
		
		// 사용
		try {
			int result = div.divide(input);
			System.err.printf("나눗셈 성공 : %d%n", result);
		} catch (DivideZeroException e) {
			System.err.printf("나눗셈 실패 : %s%n", e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
		System.out.println("프로그램 종료");
	}

}
