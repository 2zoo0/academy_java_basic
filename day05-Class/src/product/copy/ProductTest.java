package product.copy;

public class ProductTest {

	public static void main(String[] args) {
		// 1. 선언
		Product product1;
		Product product2;
		
		// 2. 초기화
		product1 = new Product("P001", "MS-아크 터치 마우스", 51330, 136);
		product2 = new Product("P002", "로지텍-G900", 125800, 32);
		
		// 3. 실행
		// 출력
		product1.print();
		product2.print();

		// 할인
		product1.discount(10);
		product2.discount(20);

		// 출력
		product1.print();
		product2.print();
		
		// 할인 끝남
		product1.discount(-11.1112);
		product2.discount(-25.0);
		
		// 출력
		product1.print();
		product2.print();
	
		// 판매
		product1.sell(-50);
		product2.sell(50);
	
		// 출력
		product1.print();
		product2.print();
	
		// 입고
		product1.store(51);
		product2.store(-51);
	
		// 출력
		product1.print();
		product2.print();
	
	
	
	}

}
