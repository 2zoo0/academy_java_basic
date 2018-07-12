package encap.person;

public class Teacher extends Person{
	// 멤버 변수 선언
	private String subject;

	// 생성자
	Teacher() {
	}

	Teacher(String subject){
		this.subject = subject;
	}

	Teacher(String id, String name, int age, String subject){
		super(id, name, age);
		this.subject = subject;
	}
	
	// 필드 접근자 수정자
	/** getSubject */
	public String getSubject() {
		return subject;
	}
	/** setSubject */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	// 메소드
	@Override
	public String toString() {
		String teacherStr = String.format(", 과목:%s", subject);
		return "교사 정보 [" + super.toString() + teacherStr + "]";
	}
	

	@Override
	public void print() {
		System.out.println("== 교사 ==");
		System.out.println(this);
	}
	
	
}
