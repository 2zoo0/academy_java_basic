package shop;


/**
 * 제품 판매 매장에서 관리하는 대상인
 * 제품을 정의하는 클래스
 * -------------------------------------------
 * 제품번호 : prodCode : String
 * 제품 명  : prodName : String
 * 가격     : price    : int
 * 재고수량 : quantity : int
 * -------------------------------------------
 * 기본생성자, 매개변수를 받는 생성자 각 필드 1개씩 늘려가며
 * 생성자 중복정의로 5개의 생성자를 정의 this, this() 사용
 * -------------------------------------------
 * 메소드 
 * print() : void 
 *    ==> 제품의 상태 출력
 * discount(double percentage) : int 
 *    ==>입력된 퍼센트만큼 할인가격 리턴
 * 
 * sell(int amount) : void 
 *    ==> 매장에서 판매(출고)되어 재고수량이 줄어듬
 * buy(int amount) : void
 *    ==> 매장에 입고되어 재고수량이 늘어남
 * 
 * set(Sting prodCode, String prodName
 *    , int price, int quantity) : void
 *    ==> 네 개의 필드에 대하여 입력된 값으로 수정
 *  
 * @author PC38207
 *
 */
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
	 * 입력된 퍼센트만큼 할인된 가격 반환
	 * @param percentage
	 * @return
	 */
	int discount(double percentage) {
		int dcPrice = (int)(price * ((100.0 - percentage) / 100));
		return dcPrice;
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
	void buy(int amount) {
		if (amount >= 0) {
			quantity += amount;
		}
	}
	/**
	 * 입력된 값으로 제품 정보를 수정하여 저장
	 * @param prodCode
	 * @param prodName
	 * @param price
	 * @param quantity
	 */
	public void set(String prodCode, String prodName, int price, int quantity) {
		if(!this.prodCode.equals(prodCode)) {
			this.prodCode = prodCode;
		}
		
		if(!this.prodName.equals(prodName)) {
			this.prodName = prodName;
		}

		if(this.price != price) {
			this.price = price;
		}

		if(this.quantity != quantity) {
			this.quantity = quantity;
		}
		
	}

}
