package array.basic;
/**
 * 배열과 for 구문구조의 조합
 * --------------------------
 * 배열과 for 구문읜 항상 같이 사용되는 조합이므로
 * 둘 사이의 용법의 능숙하게 다룰 수 있어야 한다.
 * 
 * 10칸 짜리 int 배열변수를 선언하고
 * for 구문으로 초기화 진행
 * for 구문으로 출력을 진행
 * @author PC38227
 *
 */
public class ArrayAndFor {

	public static void main(String[] args) {
		// 1. 선언 : int 배열 참조 변수 선언
		int[] numbers;
		// 원소의 합을 저장할 변수 선언
		int summary;
		
		// 2. 초기화 : 배열 참조 변수의 타입은 기본형 8가지가 아니므로 new 로 초기화해야 함.
		numbers = new int[10];
		summary = 0;
		// 3. 사용
		// (1) 1 ~ 10 까지 값을 할당 : for 구문 사용
		for (int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = idx + 1;
		}
		
		// (2) 할당한 값을 출력 : for 구문
		for (int idx = 0; idx < numbers.length; idx++) {
			System.out.printf("numbers[%d] = %d%n", idx, numbers[idx]);
		}
		
		// (3) 할당한 값을 출력 : foreach 구문
		for (int number : numbers) {
			System.out.printf("numbers = %d%n", number);
		}
		
		// (4) 
		System.out.println("원소의 총합");
		for (int number : numbers) {
			summary += number;
		}
		System.out.printf("summary = %d%n", summary);
		
	}

}
