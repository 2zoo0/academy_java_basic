package shoes.list;

import shoe.Shoe;
import shoe.ShoeMap;

public class ShoeMapTest {

	public static void main(String[] args) {
		ShoeMap shoes = new ShoeMap();
		
		Shoe adidas = 
				new Shoe("SH001", "스탠스미스", 260, 65000, "운동화", 5);
		Shoe nike = 
				new Shoe("SH002", "레볼루션4", 270, 48300, "운동화", 8);
		Shoe birkenstock = 
				new Shoe("SH003", "밀라노", 250, 69000, "샌들", 15);
		Shoe hawkins = 
				new Shoe("SH004", "두에로", 265, 49000, "슬리퍼", 21);
		
		// shoes에 신발들 추가
		shoes.add(adidas);
		shoes.add(nike);
		shoes.add(birkenstock);
		shoes.add(hawkins);
		
		// shoes 전체 조회
		shoes.getAllShoes();
		
		// sh003 제품 수정
		shoes.set(new Shoe("SH003", "밀라노", 250, 69000, "샌들", 0));
		
		// sh003만 조회
		System.out.println();
		shoes.get(new Shoe("SH003", null, 0, 0, null, 0));
		
		// 제거 후 전체목록 조회
		shoes.remove(adidas);
		
		System.out.println();
		shoes.getAllShoes();
	}
}
