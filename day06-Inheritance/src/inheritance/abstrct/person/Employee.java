package inheritance.abstrct.person;

public class Employee extends Person{

	// 멤버 변수
	String dept;
	
	// 생성자
	 Employee() {
	
	 }
	 
	 Employee(String dept) {
		 this.dept = dept;
	 }
	 
	 Employee(String id, String name, int age, String dept) {
		 super(id, name, age);
		 this.dept = dept;
	 }

	 // 메소드 선언
	@Override
	public String toString() {
		String employeeStr = String.format(", 부서:%s", dept);
		return "직원 정보 [" + super.toString() + employeeStr + "]";
	}
	 
	@Override
	public void print() {
		System.out.println("== 직원 ==");
		System.out.println(this);
	}
	 
}
