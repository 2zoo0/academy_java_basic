package api.collection;

import java.util.List;

import api.object.Product;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {
	public static void main(String[] args) {
		
		/**
		 * ArrayList 배열의 단점을 개선한 리스트 구현 클래스
		 * 
		 * 1. 처음 생성할 때 크기가 고정되는 것
		 * 2. 데이터 추가시 동적으로 크기 변경 불가능 한 것
		 * 3. 데이터 삭제시 빈 인덱스 처리가 안되는 것
		 * 
		 * 등을 개선
		 * ------------------------------------
		 */
		
		// 1. 선언
		List list;
		
		// 2. 초기화
		list = new ArrayList();
		
		// 3. 사용
		// (1) 리스트에 아이템 추가
		System.out.println(list.add("1st Item"));
		System.out.println(list.add(2)); // auto - boxing
		System.out.println(list.add(new Double(3.0))); // 명시적 wrapper 사용
		System.out.println(list.add(new Boolean(true))); // 명시적 wrapper 사용
		System.out.println(list.add(false)); // auto - boxing
		
		// 사용자 정의 타입 객체도 추가
		Product product = new Product("P001", "MS-아크 터치 마우스", 51330, 36);
		System.out.println(list.add(product));
		
		// 동일한 데이터 추가 시도
		System.out.println("==== 동일한 데이터 추가 시도 ====");
		System.out.println(list.add("1st Item"));
		
		// (2) list 출력
		System.out.println("==== list 직접출력 ====");
		System.out.println(list);
		
		System.out.println("==== foreach로 출력 ====");
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("==== index 사용 for 로 출력 ====");
		for (int idx = 0; idx < list.size(); idx++) {
			System.out.println(list.get(idx));
		}
	}
}
