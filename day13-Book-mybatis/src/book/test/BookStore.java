package book.test;

import java.util.HashMap;

import book.controller.BookManager;
import book.dao.BookShelf;
import book.dao.MybatisBookShelf;
import book.vo.Book;

public class BookStore {

	public static void main(String[] args) {

//		List<Book> libooks = new ArrayList<Book>();
		
//		BookShelf shelf = new ListBookShelf(libooks);
//		BookShelf shelf = new JdbcBookShelf();
		BookShelf shelf = new MybatisBookShelf();
		
		
		BookManager manager = new BookManager(shelf);

		Book stockBook = new Book("BK001", "하루 만에 수익 내는 실전 주식투자", "강창권", 18000, "9791160505016", "길벗");

		Book essay = new Book("BK002", "이제부터 민폐 좀 끼치고 살겠습니다", "고코로야 진노스케", 12600, "9788901225395", "걷는나무");
		
		Book cartoon = new Book("BK003", "원피스 ONE PIECE 89권", "오다 에이이치로", 4500, "9791133482955", "대원 ");

		manager.insert(stockBook);
		manager.insert(essay);
		manager.insert(cartoon);

		System.out.println("=========");
		
		manager.select(stockBook);
		manager.select(essay);
		manager.select(cartoon);
		
		System.out.println("- 가격 검색 -");
		
		HashMap<String, Object> bounds = new HashMap<String, Object>();
		bounds.put("low", 15000);
		bounds.put("high", 20000);
		manager.select(bounds);


		System.out.println("- 키워드 검색 -  민폐");
		manager.select("민폐");
		System.out.println("- 총 권수 -");
		manager.totalCount();
		System.out.println("=========");

		Book essay2 = new Book("BK002", "이제부터 민폐 좀 끼치고 살겠습니다", "진노스케 코고로야", 10200, "9788901225395", "걷는나무");
		manager.update(essay2);
//		System.out.println("=========");
		manager.select(essay2);

//		manager.delete(stockBook);
		System.out.println("=========");
		manager.delete(essay);
		System.out.println("=========");
		manager.delete(cartoon);
		System.out.println("=========");
		manager.select();
//
		System.out.println("- 전체 갯수 -");
		manager.totalCount();
		System.out.println("- 전체 삭제 -");
		manager.delete();
		manager.totalCount();
	}

}
