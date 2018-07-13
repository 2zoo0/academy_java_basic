package shoes.test;

import java.util.HashSet;
import java.util.Set;

import shoe.Shoe;

public class ShoeSetTest {
	
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
		Set<Shoe> shoes = new HashSet<Shoe>();
        
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
		
		Shoe found = null;
		
		for (Shoe sho : shoes) {
			if (sho.getShoeCode().equals("SH003")) {
				found = sho;
				break;
			}
		}
		
		System.out.println(found);
		System.out.println("4==============");
		
		// 5. SH003 번 코드로 등록된 신발의 정보에서 재고를 0으로 조정
		
		if (shoes.contains(found)) {
			shoes.remove(found);
			shoes.add(new Shoe("SH003", "밀라노", 250, 69000, "샌들", 0));
		}
		
		System.out.println("5==============");
		
		// 6. 재고가 조정된 내용 출력
		found = null;
		for (Shoe sho : shoes) {
			if (sho.getShoeCode().equals("SH003")) {
				found = sho;
				break;
			}
		}
		System.out.println(found);
		System.out.println("6==============");
		
		// 7. SH003 번 코드로 등록된 신발 정보를 삭제
		found = null;
		for (Shoe sho : shoes) {
			if (sho.getShoeCode().equals("SH003")) {
				found = sho;
				shoes.remove(found);
				break;
			}
		}
		System.out.println("7==============");
		
		// 8. 삭제된 신발의 정보가 shoes 에 없는 것을 출력(전체 출력)
		for (Shoe shoe : shoes) {
			System.out.println(shoe);
		}
		
		
	}
	
}
