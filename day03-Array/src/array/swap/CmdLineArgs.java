package array.swap;
/**
 * Eclipse IDE 에서 명령줄 인수르 사용하는 방법
 * 소스코드 ==> 오른쪽 마우스 버튼 ==> Run as...
 * 		 ===> Run Configuration..
 * 		 ===> 명령줄 인수를 적용할 클래스를 왼쪽 목록에서 선택
 * 		 ===> (x)Arguments 텝에 데이터를 빈칸 구분 입력
 * 		 ===> apply == > run
 * @author PC38207
 *
 */
public class CmdLineArgs {

	public static void main(String[] args) {

		//main 메소드의 매겨변수로 선언이 이미 되어 있는
		// args 변수를 출력
		for (String input: args) {
			System.out.printf("%s \t", input);
		}
	}

}
