package shop.mapper;

import java.util.List;

import shop.vo.Product;

public interface ProductMapper {

	int insert(Product product);
	int update(Product product);
	int deleteOne(Product product);
	Product selectOne(Product product);
	List<Product> selectAll();
	String isExists(Product product);
	
	
	
}
