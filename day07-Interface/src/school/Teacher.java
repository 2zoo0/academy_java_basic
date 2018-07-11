package school;

public class Teacher extends Person implements Lesson{
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

	@Override
	public String attend() {
		// 교사 [아이디]가 출석하였습니다.
		String tchStr = String.format("교사 %s(이)가 출근하였습니다.", this.getId());
		return tchStr;
	}

	@Override
	public String lesson() {
		// 교사 [아이디]가 과목[과목명] 수업을 하고 있습니다.
		return String.format("교사 [%s](이)가 과목[%s] 수업을 하고 있습니다.", this.getId(), this.getSubject());
	}
	
	
}
