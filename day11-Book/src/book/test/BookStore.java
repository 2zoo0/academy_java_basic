package book.test;

import java.util.ArrayList;
import java.util.List;

import book.controller.BookManager;
import book.dao.BookShelf;
import book.dao.ListBookShelf;
import book.vo.Book;

public class BookStore {

	public static void main(String[] args) {

		List<Book> libooks = new ArrayList<Book>();
//		Set<Book> booksSet = new HashSet<Book>();
//		Map<String, Book> booksMap = new HashMap<>();
		
		BookShelf shelf = new ListBookShelf(libooks);
//		BookShelf shelf = new SetBookShelf(booksSet);
//		BookShelf shelf = new MapBookShelf(booksMap);
//		BookShelf shelf = new JdbcBookShelf();
		
		BookManager manager = new BookManager(shelf);

		Book stockBook = new Book("BK001", "하루 만에 수익 내는 실전 주식투자", "강창권", 18000, "9791160505016", "길벗");

		Book essay = new Book("BK002", "이제부터 민폐 좀 끼치고 살겠습니다", "고코로야 진노스케", 12600, "9788901225395", "걷는나무");

		manager.insert(stockBook);
		manager.insert(essay);
		System.out.println("=========");
		
		manager.select();
		
		System.out.println("- 가격 검색 -");
		manager.select(10000, 15000);
		System.out.println(" - 키워드 검색 - ");
		manager.select("민폐");
		System.out.println("- 총 권수 -");
		manager.totalCount();
		System.out.println("=========");
		
		Book essay2 = new Book("BK002", "이제부터 민폐 좀 끼치고 살겠습니다", "진노스케 코고로야", 12600, "9788901225395", "걷는나무");
		manager.update(essay2);
		manager.select(new Book("BK002", null, null, 0, null, null));
		System.out.println("=========");
		
		manager.delete(essay);
		manager.select();
		
		manager.totalCount();
		
		manager.delete();
		manager.totalCount();
	}

}
