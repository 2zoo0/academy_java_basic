package product.copy;

public class Product {

	String prodCode;
	String prodName;
	int price;
	int quantity;
	
	// 기본 생성자
	Product(){
	}
	
	/**
	 * 아래 변수를 초기화하는 생성자
	 * @param prodCode
	 */
	Product(String prodCode){
		this.prodCode = prodCode;
	}
	
	/**
	 * 아래 변수들을 초기화하는 생성자
	 * @param prodCode
	 * @param prodName
	 */
	Product(String prodCode, String prodName){
		this(prodCode);
		this.prodName = prodName;
	}
	
	/**
	 * 아래 변수들을 초기화하는 생성자
	 * @param prodCode
	 * @param prodName
	 * @param price
	 */
	Product(String prodCode, String prodName, int price){
		this(prodCode, prodName);
		this.price = price;
	}
	
	/**
	 * 아래 변수들을 초기화하는 생성자
	 * @param prodCode
	 * @param prodName
	 * @param price
	 * @param quantity
	 */
	Product(String prodCode, String prodName, int price, int quantity){
		this(prodCode, prodName, price);
		this.quantity = quantity;
	}
	
	
	
	/**
	 * 출력하는 메소드
	 */
	void print() {
		System.out.printf("제품코드 : %s, 제품명 : %12s, 제품가격 : %6d원, 재고량 : %5d개 %n",prodCode, prodName, price, quantity);
	}
	
	/**
	 * 가격을 할인률 만큼 깎고 그 값을 반환하는 메소드
	 * @param percentage
	 * @return
	 */
	int discount(double percentage) {
		// 100(원래가격)에서 percentage만큼 할인한 가격
		price = (int)(price * ((100.0 - percentage) / 100));
		return price;
	}

	/**
	 * sell된 count 만큼 quantity 줄이는 메소드
	 * @param count
	 */
	void sell(int count) {
		if (quantity-count > 0 && count >= 0) {
			quantity -= count;
		}// if end
	}
	
	/**
	 * store된 amount만큼 quantity 추가하는 메소드
	 * @param amount
	 */
	void store(int amount) {
		if (amount >= 0) {
			quantity += amount;
		}
	}

}
