package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 제품정보를 저장할 자료구를 리스트로 관리하는 창고 클래스
 * @author PC38206
 *
 */
public class MapWarehouse implements GeneralWarehouse {
	
	// 1. 멤버 변수 선언부
	private Map<String, Product> products;
	
	// 2. 생성자 선언부
	// (1) 기본 생성자
	public MapWarehouse() {
		products = new HashMap();
	}
	
	public MapWarehouse(Map<String, Product> prodsMap) {
		this.products = prodsMap;
	}

	public Map<String, Product> getProducts() {
		return products;
	}

	public void setProducts(Map<String, Product> products) {
		this.products = products;
	}

	@Override
	public int add(Product product) {
		products.put(product.getProdCode(), product);
		boolean success = products.containsKey(product.getProdCode());
		int successCnt = 0;
		
		if (success) {
			successCnt++;
		} 
		return successCnt;
	}


	@Override
	public Product get(Product product) {
		Product found = null;
		
		if (products.get(product.getProdCode()) != null) {
			found = products.get(product.getProdCode());
		}
		return found;
	}

	@Override
	public int set(Product product) {
		int result = -1;
		if (products.containsKey(product.getProdCode())) {
			products.put(product.getProdCode(), product);
			result = 1;
		}
		
		return result;
	}

	@Override
	public int remove(Product product) {
		int result = -1;
		if (products.containsKey(product.getProdCode())) {
			products.remove(product.getProdCode(), product);
			
			result = 1;
		}
		return result;
	}

	@Override
	public List<Product> getAllProducts() {	
		Set<String> keySet = this.products.keySet();
		List<Product> products = new ArrayList<Product>();
		for (String key : keySet) {
			products.add(this.products.get(key));
		}
		
		return products;
	}

}