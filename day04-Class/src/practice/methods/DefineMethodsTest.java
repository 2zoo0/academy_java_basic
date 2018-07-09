package practice.methods;

public class DefineMethodsTest {

	public static void main(String[] args) {
		DefineMethods deMeth;
		deMeth = new DefineMethods();
		
		System.out.println("  1. \n");
		deMeth.printTenTimes(5); // 1
		
		System.out.println("\n=================\n 2. \n");
		
		deMeth.printSomebodyMessage("안녕하세요.", "이주영"); // 2
		
		System.out.println("\n=================\n 3. \n");
		
		deMeth.printMessage("안뇽하시오?"); // 3
		
		System.out.println("\n=================\n 4. \n");
		
		String str = deMeth.returnOriginalMessage("하이 헬로"); // 4
		System.out.println(str);
		System.out.println("\n=================\n 5. \n");
		
		int add = deMeth.addTen(5); // 5
		System.out.println(add);
		System.out.println("\n=================\n 6. \n");
		
		int subtract = deMeth.subtractTen(15); // 6
		System.out.println(subtract);
		System.out.println("\n=================\n 7. \n");
		
		double mDouble = deMeth.makeDouble(5.5); // 7
		System.out.println(mDouble);
		System.out.println("\n=================\n 8. \n");
		
		double fDouble = deMeth.subtractFivePointFive(8.8); // 8
		System.out.println(fDouble);
		System.out.println("\n=================\n 9. \n");
		
		String fullName = deMeth.makeFullName("주영","이"); // 9
		System.out.println(fullName);
		System.out.println("\n=================\n 10. \n");
		
		int intAdd = deMeth.add(6, 6); // 10
		System.out.println(intAdd);
		System.out.println("\n=================\n 11. \n");
		
		double doubleAdd = deMeth.add(6.6, 6.6); // 11
		System.out.println(doubleAdd);
		System.out.println("\n=================\n 12. \n");
		
		deMeth.printMsgManyTimes("반복하자.", 4); // 12
		System.out.println("\n=================\n 13. \n");
		
		deMeth.arithmetic("+", 2, 3); // 13
		deMeth.arithmetic("-", 4, 5);
		deMeth.arithmetic("/", 6, 7);
		deMeth.arithmetic("*", 8, 9);
		System.out.println("\n=================\n 14. \n");
		
		double arithResult = deMeth.arithmetics("+", 2, 3); // 14
		System.out.println(arithResult);
		arithResult = deMeth.arithmetics("-", 4, 5);
		System.out.println(arithResult);
		arithResult = deMeth.arithmetics("*", 6, 7);
		System.out.println(arithResult);
		arithResult = deMeth.arithmetics("/", 8, 9);
		System.out.println(arithResult);
		System.out.println("\n=================\n 15. 정수 하나 받아서 홀짝 true false 리턴\n");
		
		boolean inEvenResult = deMeth.inEven(5); // 15
		System.out.println(inEvenResult);
		System.out.println("\n=================\n");
		
		System.out.println("\n=================\n");
		
		//==================
		
		int absol = deMeth.absolut(-6628); // 1
		System.out.println(absol);
		absol = deMeth.absolut(6628);
		System.out.println(absol);
		System.out.println("\n=================\n");
		
		deMeth.findNultiple(6); // 2
		
		System.out.println("\n=================\n");
		
		String decSign = deMeth.decideSign(-1); // 3
		System.out.println(decSign);
		decSign = deMeth.decideSign(0); // 3
		System.out.println(decSign);
		decSign = deMeth.decideSign(3); // 3
		System.out.println(decSign);
		System.out.println("\n=================\n");
		
		deMeth.repeatedMessage("원소마다 저장하고 출력", 4); // 4
		
		System.out.println("\n=================\n");
		
		double calCircle = deMeth.calcCircleArea(7); // 5
		System.out.println(calCircle);
		System.out.println("\n=================\n");
		
		int[] multipleResult = deMeth.makeMultipleNums(7); // 6
		for (int idx = 0; idx < multipleResult.length; idx++) {
			System.out.printf("%d%n", multipleResult[idx]);
		}
	
	}

}
