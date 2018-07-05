package control.loop;

/**
 * for 반복구조에서 선언식, 조건식 , 증감식이
 * 생략된 구문을 무한반복을 테스트하는 클래스
 * @author PC38227
 *
 */
public class InfiniteFor {

	public static void main(String[] args) {
		// for 문 안에 선언 초기화 실행
		// for문 안에 조건식이 없으면 항상 true를 반환하므로 끝없이 반복함
		for(int idx = 0; ; idx++) {
			System.out.printf("idx = %d%n", idx);
		} // end for
	}

}
