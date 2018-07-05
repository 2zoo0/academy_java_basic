package control.loop;

import java.util.Scanner;

public class CalculBMI {

	public static void main(String[] args) {
		// 1. 선언
		double kg;
		double m;
		double BMI;

		Scanner scan;

		scan = new Scanner(System.in);

		System.out.println("키 입력(cm)");
		m = scan.nextDouble();
		System.out.println("무게입력(kg)");
		kg = scan.nextDouble();
		
		m /= 100;
		
		BMI = kg / (m * m);
		
		System.out.println(BMI);
		
		if (BMI < 15.0) {
			System.out.println("병적인 저체중");
		} else if (BMI >= 15.0 && BMI < 18.5) {
			System.out.println("저체중");
		} else if (BMI >= 18.5 && BMI < 23.0) {
			System.out.println("정상");
		} else if (BMI > 23.0 && BMI <= 27.5) {
			System.out.println("과체중");
		} else if (BMI > 27.5 && BMI <= 40.0) {
			System.out.println("비만");
		} else if (BMI > 40 ) {
			System.out.println("병적인 비만");
		}// 조건문 끝

	}

}
