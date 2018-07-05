package control.loop;

/**
 * 1 ~ 100 사이의 홀수의 합을 for 반복문과 continue 의 조합으로 구하는 클래스
 * 
 * @author PC38227
 *
 */
public class SumofOdds2 {

	public static void main(String[] args) {
		// 1. 선언
		int sum;
		int idx;

		// 2. 초기화
		for (sum = 0, idx = 1; idx <= 100; idx++) {
			if (idx % 2 == 0) {
				// idx 가 짝수
				continue;
				// continue
			}
			sum += idx;
		}
		System.out.printf("1 ~ 100 사이의 짝수의 합 %d%n", sum);

		for (sum = 0, idx = 1; idx <= 100; idx++) {
			if (idx % 2 == 0) {
			} else {
				// idx 가 짝수
				sum += idx;
				// continue
			}
		}
		System.out.printf("1 ~ 100 사이의 홀수의 합 %d", sum);
	}

}
