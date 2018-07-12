package encap.person;

/**
 * Person 과 상속관계인 Student, Teacher, Employee를 
 * 테스트하는 클래스이다.
 * @author PC38207
 *
 */
public class PersonTest {

	public static void main(String[] args) {

		// 1. 선언, 2. 초기화
		Person[] persons = new Person[3];
		persons[0] = new Student("S02", "홍길동", 18, "도술");
		persons[1] = new Teacher("T03", "홍길동", 18, "분신술");
		persons[2] = new Employee("E04", "홍길동", 18, "활빈당");
		
		// 3. 사용
		for (Person person : persons) {
			person.print();
		}
		
	}

}




