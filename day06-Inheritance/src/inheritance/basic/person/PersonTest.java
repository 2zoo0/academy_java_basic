package inheritance.basic.person;

/**
 * Person 과 상속관계인 Student, Teacher, Employee를 
 * 테스트하는 클래스이다.
 * @author PC38207
 *
 */
public class PersonTest {

	public static void main(String[] args) {

		// 1. 선언  2. 초기화
		Person person = new Person("P01", "홍길동", 18);
		Student student = new Student("S01", "홍길동", 18, "도술");
		Teacher teacher = new Teacher("T01", "홍길동", 18, "분신술");
		Employee employee = new Employee("E01", "홍길동", 18, "활빈당");
		
		// 3. 사용
		System.out.println(person);
		System.out.println(student);
		System.out.println(teacher);
		System.out.println(employee);
	}

}
