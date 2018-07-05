package control.ifstmt;
/***
 *  다중 선택 if 구문을 사용하여 다음의 기준으로
 *  
 *  90점 이상 A
 *  80 ~ 89 B
 *  60 ~ 79 C
 *  40 ~ 59 D
 *  나머지 F
 *  
 *  입력된 점수에 대해 학점을 계산하는 클래스를 작성
 *  
 *  입력 int 타입 변수명 score
 *  학점 char 타입 변수명 grade 를 사용할 것
 *  
 */
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// 1. 선언
		int score;
		char grade;
		// 스캐너 선언
		Scanner scan = new Scanner(System.in);
		
		// 2. 초기화
		System.out.println("1~100 사이의 정수를 입력");
		score = scan.nextInt();
		if(score > 90) {
			grade = 'A';
		}else if(score < 89 && score > 80) {
			grade = 'B';
		}else if(score < 79 && score > 60) {
			grade = 'C';
		}else if(score < 59 && score > 50) {
			grade = 'D';
		}else{
			grade = 'F';
		}
		scan.close();
		// 3. 사용
		System.out.printf("%d에 해당하는 학점은 %c입니다.", score, grade);
	}

}
