package shoes.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShoeTest {
	
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
		// (1) Shoe 타입을 저장할 수 있는 List<Shoe> shoes 를 선언하여 리스트에 add(shoe) 로 추가
        List<Shoe> shoes = new ArrayList<Shoe>();
        
		shoes.add(adidas);
		shoes.add(nike);
		shoes.add(birkenstock);
		shoes.add(hawkins);
		
		// 3. 각 자료구조별 shoes 를 foreach 로 출력
		for (Shoe shoe : shoes) {
			System.out.println(shoe);
		}
		System.out.println("3==============");
		
		// 4. SH003 번 코드로 등록된 신발의 정보 1개를 출력
		
		int index = 0;
		for (int idx = 0; idx < shoes.size(); idx++) {
			// 배열의 인덱스에서 추출한 제품정보 한개
			// products[idx] 의 제품코드 필드(prodCode) 가
			// 매개변수로 넘어온 product 의 제품코드 필드와
			// 동일한지 비교하고 그때의 배열 인덱스를 저장
			if (shoes.get(idx).getShoeCode()
					.equals("SH003")) {
				index = idx;
				break;
			}
		}
		
		System.out.println(shoes.get(index));
		System.out.println("4==============");
		
		// 5. SH003 번 코드로 등록된 신발의 정보에서 재고를 0으로 조정
		int setIndex = -1;
		
		if ((setIndex = index) > -1) {
			
			shoes.set(setIndex, new Shoe("SH003", "밀라노", 250, 69000, "샌들", 0));
		}
		
		System.out.println("5==============");
		
		// 6. 재고가 조정된 내용 출력
		System.out.println(shoes.get(index));
		System.out.println("6==============");
		
		// 7. SH003 번 코드로 등록된 신발 정보를 삭제
		setIndex = -1;
		
		if ((setIndex = index) > -1) {
			
			shoes.remove(setIndex);
		}
		System.out.println("7==============");
		
		// 8. 삭제된 신발의 정보가 shoes 에 없는 것을 출력(전체 출력)
		for (Shoe shoe : shoes) {
			System.out.println(shoe);
		}
	}
	
}
