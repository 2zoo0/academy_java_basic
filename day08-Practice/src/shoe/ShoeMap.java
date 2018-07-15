package shoe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ShoeMap {
	// 멤버 변수 선언
	private Map<String, Shoe> shoes;

	// 생성자 선언
	public ShoeMap() {
		shoes = new HashMap();
	}

	public ShoeMap(Map<String, Shoe> shoes) {
		this.shoes = shoes;
	}

	// 메소드 
	
	public int add(Shoe shoe) {
		shoes.put(shoe.getShoeCode(), shoe);
		boolean success = shoes.containsKey(shoe.getShoeCode());
		int successCnt = 0;
		
		if (success) {
			successCnt++;
		} 
		
		return successCnt;
	}
	
	public Shoe get(Shoe shoe) {
		Shoe found = null;
		
		if (shoes.get(shoe.getShoeCode()) != null) {
			found = shoes.get(shoe.getShoeCode());
			System.out.println(found);
		}
		
		return found;
	}
	
	
	public int set(Shoe shoe) {
		int successCnt = 0;
		
		if (shoes.get(shoe.getShoeCode()) != null) {
			shoes.put(shoe.getShoeCode(), shoe);
			successCnt++;
		}
		
		return successCnt;
	}
	
	public int remove(Shoe shoe) {
		int successCnt = 0;
		
		if (shoes.get(shoe.getShoeCode()) != null) {
			shoes.remove(shoe.getShoeCode());
			successCnt++;
		}
		
		return successCnt;
	}
	
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
