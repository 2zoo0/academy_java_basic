package school;

public class Employee extends Person{

	// 멤버 변수
	private String dept;
	
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
	 
	 // 필드 접근자/수정자
	 /** getDept */
	 public String getDept() {
		return dept;
	}
	 /** setDept */
	public void setDept(String dept) {
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

	@Override
	public String attend() {
		// 교직원 [아이디]가 출근하였습니다.
		String empStr = String.format("교직원 %s(이)가 [%s]출근하였습니다.", this.getId(), this.getDept());
		return empStr;
	}
	 
}
