package control.switchstmt;
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

public class ReportGrade {
	public static void main(String[] args) {
		// 1. 선언
		// 입력받을 값을 저장할 변수 선언
		int score;
		char grade;
		
		// 입력을 위한 스캐너 변수 선언;
		Scanner scan;
		// 2. 초기화
		scan = new Scanner(System.in);
		
		
		System.out.println("점수를 입력하세요.");
		score = scan.nextInt();
		
		scan.close();
		// 3. 사용 
		switch (score/10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 6: case 7:
			grade = 'C';
			break;
		case 5: case 4:
			grade = 'D';
			break;
		default :
			grade = 'F';
		} // end switch 
		System.out.printf("학점은 %c 입니다.", grade);
	} // end main
} // end class
