package shoes.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import shoes.Shoe;


public class ShoeMap {
	// 멤버 변수 선언
	private Map<String, Shoe> shoes;

	// 생성자 선언
	public ShoeMap() {
		shoes = new HashMap<String, Shoe>();
	}

	public ShoeMap(Map<String, Shoe> shoes) {
		this.shoes = shoes;
	}

	// 메소드 
	
	/**
	 * add(Shoe shoe) : int : 추가 성공 : 1, 추가 실패 : 0
	 * @param shoe
	 * @return
	 */
	public int add(Shoe shoe) {
		shoes.put(shoe.getShoeCode(), shoe);
		boolean success = shoes.containsKey(shoe.getShoeCode());
		int successCnt = 0;
		
		if (success) {
			successCnt++;
		} 
		
		return successCnt;
	}
	
	/**
	 * get(Shoe shoe) : Shoe : 조회 성공 : shoe, 조회 실패 : null
	 * @param shoe
	 * @return
	 */
	public Shoe get(Shoe shoe) {
		Shoe found = null;
		
		if (shoes.get(shoe.getShoeCode()) != null) {
			found = shoes.get(shoe.getShoeCode());
			System.out.println(found);
		}
		
		return found;
	}
	
	/**
	 * set(Shoe shoe) : int : 수정 성공 : 1, 수정 실패 : 0
	 * @param shoe
	 * @return
	 */
	public int set(Shoe shoe) {
		int successCnt = 0;
		
		if (shoes.get(shoe.getShoeCode()) != null) {
			shoes.put(shoe.getShoeCode(), shoe);
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
		int successCnt = 0;
		
		if (shoes.get(shoe.getShoeCode()) != null) {
			shoes.remove(shoe.getShoeCode());
			successCnt++;
		}
		
		return successCnt;
	}
	
	/**
	 * getAllShoes()  : List<Shoe> : 전체목록을 리턴
	 * @return
	 */
	public List<Shoe> getAllShoes() {	
		Set<String> keySet = this.shoes.keySet();
		List<Shoe> shoes = new ArrayList<Shoe>();
		for (String key : keySet) {
			shoes.add(this.shoes.get(key));
			System.out.println(this.shoes.get(key));
		}
		
		return shoes;
	}
	
	
	
	
	

}
