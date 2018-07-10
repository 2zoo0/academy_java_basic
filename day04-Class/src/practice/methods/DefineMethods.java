package practice.methods;

public class DefineMethods {

	// 1. 번 input  10씩 증가 10번

	public void printTenTimes(int input){
		for (int idx = 1; idx <= 10; idx++) {
			input += 10; // <-- 매개 변수를 바꾸는 것은 좋지 않음
			System.out.printf("%d%n", input);
		}
	}

	// 2. 번 메시지와 이름 입력 받아 출력 메소드
	public void printSomebodyMessage(String message, String name){
		System.out.printf("%s의 메시지 : %s",name, message);
	}

	// 3. 메시지를 출력
	public void printMessage(String message){
		System.out.print(message);
	}

	// 4.
	public String returnOriginalMessage(String message){
		return message;
	}

	// 5.
	public int addTen(int input){
		input += 10; // <-- 매개 변수를 바꾸는 것은 좋지 않음
		return input;
	}

	// 6.
	public int subtractTen(int input){
		return input -= 10;
	}

	// 7.
	public double makeDouble(double input){
		return input * 2.0;
	}

	// 8.
	public double subtractFivePointFive(double input){
		return input - 5.5;
	}

	// 9.
	public String makeFullName(String name, String surname){
		return surname + " " + name;
	}

	// 10.
	public int add(int x, int y) {
		return x + y;
	}

	// 11.
	public double add(double x, double y){
		return x + y;
	}

	// 12.
	public void printMsgManyTimes(String message, int input){
		for (int idx = 1; idx <= input; idx++) {
			System.out.printf("%s, 반복횟수 %d%n", message, idx);
		}
	}

	// 13.
	public void arithmetic(String operator, int x, int y){
		switch(operator){
			case "+" : 
				System.out.printf("%d + %d = %d%n", x, y, x+y);
				break;
			case "-" : 
				System.out.printf("%d - %d = %d%n", x, y, x-y);
				break;
			case "/" : 
				System.out.printf("%d / %d = %d%n", x, y, x/y);
				break;
			case "*" : 
				System.out.printf("%d * %d = %d%n", x, y, x*y);
				break;
			default :
				System.out.println("연산자가 잘못되었습니다.");
		}
	}

	// 14. 
	public double arithmetics(String operator, int x, int y){ // double을 출력하므로 double로 입력 받는 것이 좋다.
		double result;
		result = 0.0; // 변수는 반드시 초기화를 한다.
		switch(operator){
			case "+" : result = x + y;
			break;
			case "-" : result = x - y;
			break;
			case "/" : result = x / y;
			break;
			case "*" : result = x * y;
			break;
		}
		return result;
	}

	// 15.
	public boolean inEven(int input){
		boolean result;
		if (input % 2 == 0) {
			result = true;
		} else { // boolean은 false이므로 else 문을 굳이 쓸 필요는 없음
			result = false;
		}

		return result; 
	}



	//================================//

	// 1.
	 public int absolut(int x){
		if (x < 0){
			x *= -1; // <--
		}
		return x;
	}

	// 2.
	public void findMultiple(int x){
		for(int multi = x; multi <= 100; multi += x){
			System.out.println(multi);
		}
	}
	 

	// 3. 
	public String decideSign(int x){
		String result = null;
		if (x < 0){
			result = "음의 정수";
		} else if (x == 0){
			result = "정수 0";
		} else if (x > 0){
			result = "양의정수";
		}
		return result;
	}

	// 4.
	public void repeatedMessage(String message, int repeat){
		String[] msgs = new String[repeat];
		
		// 저장
		for (int idx = 0; idx < msgs.length; idx++) {
			msgs[idx] = message;
		}
		
		// 출력 방법 1 : 이것을 권장
		for (String msg1 : msgs) {
			System.out.println(msg1);
		} 
		
		// 출력 방법 2
		for (int idx = 0; idx < msgs.length; idx++){
			System.out.println(msgs[idx]);
		}
	}

	// 5. 
	public double calcCircleArea(int r){
		double piR = 3.14 * (double)(r * r);
		return piR;
	}

	// 6.
	public int[] makeMultipleNums(int x){
		int[] Multiples = new int[100 / x]; int index = 0; // <-- 변수명은 대문자 말고 소문자로 시작
		for ( int Mul = x; Mul <= 100; Mul += x){
			Multiples[index] = Mul;
			index++;
		}
		return Multiples;
	} 
}


/**********************************************************************************
 * 매개변수 입력값에서 말고 출력문에서 값을 변경할 것 (또는 지역변수를 추가하여 지역변수를 return or 출력)
 * 
 * String 은 == 말고 equals() <-- 참조형에 사용
 * 
 * (String 은 대표적인 참조형)
 * 
 * 배열 출력은 foreach로 출력 권장
 * 
 * boolean 은 초기값 false 설정하고 if()문에만 true하면 else문은 굳이 필요 없어짐
 * 
 * 변수 명은 [소문자]로 시작
 * 
 * 변수는 항상 [초기화]
 **********************************************************************************/
