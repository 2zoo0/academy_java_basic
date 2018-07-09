package practice.methods;

/**
 * 메소드 작성 실습 클래스
 * 
 * @author PC38207
 *
 */
public class VarietyMethods {

	/*
	 * 화면에 hello, world 를 출력하는 메소드
	 */
	public void sayHello() {
		System.out.println("Hello, world!%n");
	}

	/*
	 * 매개변수로 유명인(명사) 의 이름(name)을 입력받고 그 사람이 한 유명한 문구(maxim)를 입력받아
	 * 
	 * 000(이)가 말하길 "... " 라고 하였다. 라는 문장을 출력하는 메소드를 정의하라
	 */
	public void maxims(String name, String maxim) {
		System.out.printf("%s (이)가 말하길 %n" + "\"%s\" 라고 하였다.%n", name, maxim);
	}

	// =================문============제=====================

	/**
	 * 어떤 사람의 이름, 생년, 출생월을 매개변수로 입력받아
	 * 
	 * 000는 XXXX년 XX월 생입니다.
	 * 
	 * 라는 문장으로 출력하는 메소드 birthYearMonth 라는 메소드를 디자인
	 * 
	 * @param name  : String
	 * @param year  ; int
	 * @param month : int
	 * 
	 */

	public void birthYearMonth(String name, int year, int month) {
		System.out.printf("%s는 %4d년 %2d월 생입니다.%n", name, year, month);
	}

	/**
	 * 출력할 단의 숫자를 입력받아 해당 단의 구구단을 출력하는 메소드
	 * 
	 * 출력의 첫 줄에 X 단이라는 제목을 출력 printNineNineTable
	 * 
	 * @param stage : int
	 */

	public void printNineNineTable(int stage) {
		System.out.printf("%d단%n", stage);
		
		for (int idx = 1; idx <= 9; idx++) {
			System.out.printf("%d x %d = %2d%n", stage, idx, stage * idx);
		}
	}

	/**
	 * 출력할 단의 숫자를 가지고 있는 int 배열을 매개변수로 입력받아
	 * 입력된 배열의 원소인 각 숫자에 대해
	 * 구구단을 출력하는 메소드
	 * printNineNineTableArray 를 디자인
	 * @param stages : int
	 */
	
	public void printNineNineTableArray(int[] stages) {
		for (int sta : stages) {
			System.out.printf("%n%d단", sta);
			for (int idx = 1; idx <= 9; idx++) {
				System.out.printf("%n%d x %d = %2d", sta, idx, sta * idx);
			}
			System.out.println();
		}
	}

	/**
	 * 입력된 화씨온도를 섭씨온도로 변환하여 변환된 섭씨온도를 리턴하는 메소드 fahToCel 을 디자인
	 * 
	 * @param fah : double : 변환할 화씨 온도 값
	 * @return 변환된 섭씨 온도값
	 */

	public double fahToCel(double fah) {
		double cel;
		
		cel = 5.0 / 9 * (fah - 32); 
		
		return cel;
	}

	/**
	 * 키(cm), 몸무게(kg)을 매개변수로 입력받아 BMI 지수를 계산하여
	 *  비만도 판정 결과를 리턴하는 메소드 calcBmi 를 디자인
	 * 15.0 미만 			병적인 저체중
	 * 15.0 이상 18.5 미만 	저체중
	 * 18.5 이상 23.0 미만 	정상
	 * 23.0 이상 27.5 이하 	과체중
	 * 27.5 초과 40.0 이하 	비만
	 * 40.0 초과 			병적인 비만
	 * 
	 * @param height : double
	 * @param weight : double
	 * @return 비만도 판정 결과 문자열
	 */

	public String calcBmi(double height, double weight) {
		double bmi = 0.0;
		String result = "";
		
		height /= 100;
		bmi = weight / (height * height);
		
		
		if (bmi < 15.0) {
			result = "병적인 저체중";
		} else if (bmi >= 15.0 && bmi < 18.5) {
			result = "저체중";
		} else if (bmi >= 18.5 && bmi < 23.0) {
			result = "정상";
		} else if (bmi > 23.0 && bmi <= 27.5) {
			result = "과체중";
		} else if (bmi > 27.5 && bmi <= 40.0) {
			result = "비만";
		} else if (bmi > 40 ) {
			result = "병적인 비만";
		}
		
		return "BMI 지수는 " + bmi+ "이고, " + result +"입니다.";
	}

	/**
	 * 입력된 두 정수 중에서 작은 수를 찾아 리턴하는 메소드 min을 디자인
	 * 
	 * @param input1
	 * @param input2
	 * @return : 둘 중 작은 정수
	 */
	public int min(int input1, int input2) {
		int minNum;
		
		if(input1 > input2) {
			minNum = input2;
		} else {
			minNum = input2;
		}
		
		return minNum;
	}

	/**
	 * 정수가 저장된 int배열을 매개변수로 입력받아 그 배열의 각 원소의 합을 구하여 리턴하는 메소드 sumOfArray 를 디자인
	 * 
	 * @param numbers : int 배열
	 * @return numbers배열의 각 원소의 합
	 */

	public int sumOfArray(int[] numbers) {
		int sum = 0;
		
		for (int idx = 0; idx < numbers.length; idx++) {
			sum += numbers[idx]; 
		}
		
		return sum;
	}

	/**
	 * 정수가 저장된 int 배열을 매개변수로 입력받아 그 배열의 각 원소들의 평균을 구하여 리턴하는 메소드 avgOfArray 를 디자인
	 * 
	 * @param numbers : int 배열
	 * @return numbers 배열의 각 원소의 평균
	 */

	public double avgOfArray(int[] numbers) {
		double avg = 0.0;
		int sum = 0;
		int idx;
		
		for (idx = 0; idx < numbers.length; idx++) {
			sum += numbers[idx]; 
		}
		
		avg = sum / idx;
		
		return avg;
	}

	/**
	 * char 타입의 연산자와 두 개의 정수를 매개변수로 입력받아
	 * 
	 * 입력된 연산자가 '+' 일 때만 두 정수의 합을 구하여 덧셈의 결과를 출력하는 메소드 adder 를 디자인
	 * 
	 * @param op : char
	 * @param x  : int
	 * @param y  : int
	 */

	public void adder(char op, int x, int y) {
		int result = 0;
		
		if (op == '+') {
			result = x + y; 
			System.out.printf("%d + %d = %d%n", x, y, result);
		} else {
			System.out.println("연산자가 + 가 아닙니다.\n");
		}
		
	}
}
