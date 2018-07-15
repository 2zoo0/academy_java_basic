package shoes.main.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import shoe.Shoe;

public class ShoeMapTest {
	
	public static void main(String[] args) {
		
		
		// 1. Shoe 타입의 객체를 4개 생성
		Shoe adidas = 
				new Shoe("SH001", "스탠스미스", 260, 65000, "운동화", 5);
		Shoe nike = 
				new Shoe("SH002", "레볼루션4", 270, 48300, "운동화", 8);
		Shoe birkenstock = 
				new Shoe("SH003", "밀라노", 250, 69000, "샌들", 15);
		Shoe hawkins = 
				new Shoe("SH004", "두에로", 265, 49000, "슬리퍼", 21);
		
		
		// 2. 
		// (2) Set<Shoe> shoes 를 선언하여 add(shoe)로 추가
		Map<String, Shoe> shoes = new HashMap<String, Shoe>();
        
		shoes.put(adidas.getShoeCode(), adidas);
		shoes.put(nike.getShoeCode(), nike);
		shoes.put(birkenstock.getShoeCode(), birkenstock);
		shoes.put(hawkins.getShoeCode(), hawkins);
		
		// 3. 각 자료구조별 shoes 를 foreach 로 출력
		Set<String> keySet = shoes.keySet();
		List<Shoe> shoelist = new ArrayList<Shoe>();
		for (String key : keySet) {
			shoelist.add(shoes.get(key));
			System.out.println(shoes.get(key));
		}	
		
		System.out.println("3==============");
		
		// 4. SH003 번 코드로 등록된 신발의 정보 1개를 출력
		Shoe found = null;
		
		if (shoes.get("SH003") != null) {
			found = shoes.get("SH003");
		}
		
		System.out.println(found);
		System.out.println("4==============");
		
		// 5. SH003 번 코드로 등록된 신발의 정보에서 재고를 0으로 조정
		if (shoes.containsKey(found.getShoeCode())) {
			shoes.put(found.getShoeCode(), new Shoe("SH003", "밀라노", 250, 69000, "샌들", 0));
		}
		
		System.out.println("5==============");
		
		// 6. 재고가 조정된 내용 출력
		found = null;
		if (shoes.get("SH003") != null) {
			found = shoes.get("SH003");
		}
		System.out.println(found);
		System.out.println("7==============");
		
		// 7. 7. SH003 번 코드로 등록된 신발 정보를 삭제
		found = null;
		if (shoes.get("SH003") != null) {
			found = shoes.get("SH003");
			shoes.remove(found.getShoeCode());
		}
		
		// 8. 삭제된 신발의 정보가 shoes 에 없는 것을 출력(전체 출력)
		for (String key : keySet) {
			System.out.println(shoes.get(key));
		}
	}
	
}
