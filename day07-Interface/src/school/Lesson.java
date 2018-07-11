package school;

/**
 * 학교 구성원중 학생, 교사만
 * 구현할 수업을 나타내는 인터페이스
 * @author PC38207
 *
 */
public interface Lesson {

	/**
	 * 수업을 진행함
	 * @return
	 */
	String lesson();
	// public abstract 선언은 당연하므로
	// 생략해도 자동으로 
}
