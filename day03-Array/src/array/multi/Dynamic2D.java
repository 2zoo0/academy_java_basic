package array.multi;
/**
 * 동적 2차원 배열을 생성하고 사용해보는 클래스
 * 
 * 2차수 배열은 각각 3, 4, 1, 5 사이즈로 생성
 * @author PC38207
 *
 */
public class Dynamic2D {

	public static void main(String[] args) {
		// 1. 선언
		int[][] twoDArray;
		int count = 0;
		
		// 2. 초기화
		twoDArray = new int[4][];
		twoDArray[0] = new int[3];
		twoDArray[1] = new int[4];
		twoDArray[2] = new int[1];
		twoDArray[3] = new int[5];
		
		// 3. 사용
		// (1) 2차원 배열의 각 칸에 1 ~ 13까지
		//     for 구문을 사용하여 할당
		for (int idx = 0; idx < twoDArray.length; idx++) {
			for (int idx2 = 0; idx2 < twoDArray[idx].length; idx2++) {
				twoDArray[idx][idx2] = ++count;
			}
		}
		
		for (int idx = 0; idx < twoDArray.length; idx++) {
			for (int idx2 = 0; idx2 < twoDArray[idx].length; idx2++) {
				System.out.printf("%d\t", twoDArray[idx][idx2]);
			}
			System.out.println();
		}
		
		// (3) foreach 출력
		for (int[] outer : twoDArray) {
			for (int in : outer) {
				System.out.printf("%d\t", in);
			}
			System.out.println();
		}
		
		
	}

}
