package shoes.list;
/**
 * shoeCode	String	신발 제품코드
 * shoeName	String	신발 제품 명
 * size		int		신발의 사이즈(240, 250, 260 ...)
 * price	int		가격
 * type		String	신발의 타입 (운동화, 샌들, 구두, 슬리퍼 ...)
 * quantity	int		재고수량		
 * @author PC38207	
 *
 *기본생성자 / + 생성자 중복정의 할 수 있는 만큼
 *
 *main 메소드에서
 *1. Shoe 타입의 객체를 4개 생성
 *   shoeCode 는 SH001 과 같이 일련번호를 부여
 *   shoeName, size, price, tyoe 등은
 *   실제로 있는 데이터 인터넷 검색하여 생성
 *   
 * 2. (1) Shoe 타입을 저장할 수 있는 List<Shoe> shoes 를  선언하여 리스트에 add(shoe) 로 추가
 *    (2) Set<Shoe> shoes 를 선언하여 add(shoe)로 추가
 *    (3) Map<Shoe> shoes 를 선언하여 put(code, shoe)로 추가
 *    
 * 3. 각 자료구조별 shoes 를 foreach 로 출력
 * 
 * 4. SH003 번 코드로 등록된 신발의 정보 1개를 출력
 * 
 * 5. SH003 번 코드로 등록된 신발의 정보에서 재고를 0으로 조정
 * 
 */
public class Shoe {
	
	
	// 1. 선언
	
	/** 신발 코드 */
	private String shoeCode;
	/** 신발 명 */
	private String shoeName;
	/** 사이즈 */
	private int size;
	/** 신발 가격 */
	private int price;
	/** 신발 종류 */
	private String type;
	/** 신발 수량 */
	private int quantity;
	
	
	// 2. 생성자
	/**
	 * 기본 생성자
	 */
	public Shoe() {
	}

	/**
	 * 신발 코드 필드만 초기화하는 생성자
	 * @param shoeCode
	 */
	public Shoe(String shoeCode) {
		this.shoeCode = shoeCode;
	}

	
	/**
	 * 
	 * @param shoeCode
	 * @param shoeName
	 * @param size
	 * @param price
	 * @param type
	 * @param quantity
	 */
	public Shoe(String shoeCode, String shoeName, int size, int price, String type, int quantity) {
		this.shoeCode = shoeCode;
		this.shoeName = shoeName;
		this.size = size;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
	}

	public String getShoeCode() {
		return shoeCode;
	}

	public void setShoeCode(String shoeCode) {
		this.shoeCode = shoeCode;
	}

	public String getShoeName() {
		return shoeName;
	}

	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
//--------- 재정의 --------------------------------//
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shoeCode == null) ? 0 : shoeCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shoe other = (Shoe) obj;
		if (shoeCode == null) {
			if (other.shoeCode != null)
				return false;
		} else if (!shoeCode.equals(other.shoeCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Shoe [shoeCode=" + shoeCode + ", shoeName=" + shoeName + ", size=" + size + ", price=" + price
				+ ", type=" + type + ", quantity=" + quantity + "]";
	}

	

}
