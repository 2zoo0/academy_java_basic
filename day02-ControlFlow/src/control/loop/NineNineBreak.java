package control.loop;
/**
 * break 구문을 for 반복문과 조합하여
 * 테스트 해보는 클래스
 * @author PC38227
 *
 */
public class NineNineBreak {

	public static void main(String[] args) {
		
		for (int stage = 2; stage < 10; stage++) {
			// 단의 제목 출력
			System.out.printf("%d 단%n", stage);
			for (int times = 1; times < 10; times++) {
				if (stage * times > 50) {
					break;
				}
				System.out.printf("%d x %d = %d%n", stage, times, stage*times);
			} // end times
			
		} // end stage 

	}

}
