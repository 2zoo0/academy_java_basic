package shoe;

import java.util.ArrayList;
import java.util.List;

public class ShoeList {
	// 멤버변수 선언
	private List<Shoe> shoes;

	// 생성자
	/**
	 * 기본생성자 : shoes 를 직접 ArrayList<Shoe> 로 초기화 
	 */
	public ShoeList() {
		shoes = new ArrayList<Shoe>();
	}

	/**
	 * List<Shoe> shoes 를 매개변수로 하는 생성자
	 * @param shoes
	 */
	public ShoeList(List<Shoe> shoes) {
		this.shoes = shoes;
	}
	
	// 메소드
	/**
	 * add(Shoe shoe) : int : 추가 성공 : 1, 추가 실패 : 0
	 * @param shoe
	 */
	public int add(Shoe shoe) {
		
		shoes.add(shoe);
		boolean success = shoes.get(findShoeIdx(shoe)) != null ? true : false;
		int successCnt = 0;
		
		if (success) {
			successCnt++;
		} 
		return successCnt;
	}
	
	/**
	 * set(Shoe shoe) : int : 수정 성공 : 1, 수정 실패 : 0
	 * @param shoe
	 * @return
	 */
	public int set(Shoe shoe) {
		int setIdx = findShoeIdx(shoe);
		int successCnt = 0;
		if (setIdx > -1) {
			shoes.set(setIdx, shoe);
			successCnt++;
		}
		
		return successCnt;
	}
	
	/**
	 * remove(Shoe shoe) : int : 삭제 성공 : 1, 삭제 실패 : 0
	 * @param shoe
	 * @return
	 */
	public int remove(Shoe shoe) {
		int setIdx = findShoeIdx(shoe);
		int successCnt = 0;
		if (setIdx > -1) {
			shoes.remove(setIdx);
			successCnt++;
		}
		
		return successCnt; 
	}
	
	/**
	 * get(Shoe shoe) : Shoe : 조회 성공 : shoe, 조회 실패 : null
	 * @param shoe
	 * @return
	 */
	public int get(Shoe shoe) {
		int setIdx = findShoeIdx(shoe);
		int successCnt = 0;
		if (setIdx > -1) {
			System.out.println(shoes.get(setIdx));
			
			successCnt++;
		}
		
		return successCnt; 
	}
	
	/**
	 * getAllShoes()  : List<Shoe> : 전체목록을 리턴
	 * @return
	 */
	public List<Shoe> getAllShoes() {
		List<Shoe> shoes = this.shoes;
		
		for (Shoe shoe : shoes) {
			System.out.println(shoe);
		}
		
		return shoes;
	}
	
	
	
	
	
	
	/**
	 * 
	 * @param shoe
	 * @return
	 */
	private int findShoeIdx(Shoe shoe) {
		int index = -1;

		for (int idx = 0; idx < shoes.size(); idx++) {
			if (shoes.get(idx).equals(shoe)) {
				index = idx;
				break;
			}
		}
		
		return index;
	}
	
}
