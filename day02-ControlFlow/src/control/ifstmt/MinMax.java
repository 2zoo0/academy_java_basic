package control.ifstmt;

import java.util.Scanner;

/**
 * 두 정수를 입력받아
 * 둘 중 큰 값, 작은 값을 가려내는 클래스
 * @author Lee
 *
 */
public class MinMax {

	public static void main(String[] args) {
		// 1. 선언
		int x, y;
		int max;
		int min;
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		x = scan.nextInt();
		y = scan.nextInt();
		scan.close();
		if(x<y) {
			min = x;
			max = y;
		}else {
			min = y;
			max = x;
		}
		
		// 3. 사용
		// if ~ else 구조를 사용하여 두 값중 큰 값은 항상 max, 작은 값은 항상 min 에 저장
		System.out.printf("입력된 두 정수 %d, %d %n",x, y);
		System.out.printf("둘 중 큰 값은 %d, 작은 값은 %d",max, min);		
	}

}
