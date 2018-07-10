package eraser.two;
/**
 * 칠판 지우개를 정의하는 클래스
 * ---------------------------------------
 * 가로	 width : double
 * 세로 	height : double
 * 높이 	 depth : double
 * 겹 	 layer : int
 * 네 개의 멤버 변수를 선언
 * ---------------------------------------
 * 기본 생성자 : 매개변수를 받지 않는 생성자
 * 배개변수를 받는 생성자 두 개를 정의
 * 매개변수를 받는 생성자는 네개의 필드 모두에 대해서
 * 매개변수를 받도록 정의
 * ---------------------------------------
 * 칠판 지우개의 상태를 출력    print() : void
 * 지우개의 한 겹을 제거 		peel() : void
 * ---------------------------------------
 * @author PC38207
 *
 */
public class Eraser {
	// 1. 멤버변수(실체변수) 선언부
	/** 지우개의 가로 */
	double width;
	/** 지우개의 세로*/
	double height;
	/** 지우개의 높이*/
	double depth;
	/** 지우개의 겹 수*/
	int layer;
	
	// 2. 생성자 선언부
	/**
	 * 기본 생성자
	 */
	Eraser() {
		
	}
	
	
	/**
	 * 매개변수 width 를 초기화하는 생성자
	 * @param width
	 */
	Eraser(double width) {
		this.width = width;
	}
	
	/**
	 * 매개변수 width, height를 초기화하는 생성자
	 * @param width
	 * @param height 
	 */
	Eraser(double width, double height) {
		this(width);
		this.height = height;
	}

	/**
	 * 매개변수 width, height, depth 를 초기화하는 생성자
	 * @param width
	 * @param height 
	 * @param depth
	 */
	Eraser(double width, double height, double depth) {
		this(width, height);
		this.depth = depth;
	}
	

	/**
	 * 매개변수 width, height, depth, layer 를 초기화하는 생성자
	 * @param width
	 * @param height 
	 * @param depth
	 * @param layer
	 */
	Eraser(double width, double height, double depth, int layer) {
		this(width, height, depth);
		//this()선언은 생성자 첫번째 줄에 단 1회만 사용 가능
		this.layer = layer;
	}
	
	
	
	
	

	// 3. 메소드 선언부
	/**
	 * 칠판 지우개의 상태를 출력하는 메소드
	 */
	public void print() {
		System.out.printf("가로 : %4.2f, 세로 : %4.2f, 높이 : %4.2f, 남은 겹 : %d %n", width, height, depth, layer);
	}
	
	/**
	 * 지우개의 한 겹을 제거 하는 메소드
	 */
	public void peel() {
		// 남아있는 겹의 수가 음수값이 될 수는 없으므로
		// if 구문을 사용하여 값 체크
		if(layer > 1) {
			layer--;
		} else {
			System.out.println("한 겹밖에 안 남았습니다.");
		}
	}
}
