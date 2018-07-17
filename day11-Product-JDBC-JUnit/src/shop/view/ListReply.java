package shop.view;

import java.util.List;

import shop.vo.Product;

/**
 * 찾는 제품이 없거나 하는 등으, 비정상 상황에 대한 응답을 구현
 * @author PC38207
 *
 */
public class ListReply implements Reply {

	@Override
	public void reply(Object object) {
		// 비정상 상황의 응답은 String 타입으로 발생
		List<Product> products = (List<Product>)object;
		for (Product product : products) {
			product.print();
		}
		
	}

}
