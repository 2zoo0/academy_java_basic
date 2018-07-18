package book.test;

import book.controller.BookManager;
import book.dao.BookShelf;
import book.dao.JdbcBookShelf;
import book.vo.Book;

public class BookStore {

	public static void main(String[] args) {

//		List<Book> libooks = new ArrayList<Book>();
//		Set<Book> booksSet = new HashSet<Book>();
//		Map<String, Book> booksMap = new HashMap<>();
		
//		BookShelf shelf = new ListBookShelf(libooks);
//		BookShelf shelf = new SetBookShelf(booksSet);
//		BookShelf shelf = new MapBookShelf(booksMap);
		BookShelf shelf = new JdbcBookShelf();
		
		BookManager manager = new BookManager(shelf);

		Book stockBook = new Book("BK001", "하루 만에 수익 내는 실전 주식투자", "강창권", 18000, "9791160505016", "길벗");

		Book essay = new Book("BK002", "이제부터 민폐 좀 끼치고 살겠습니다", "고코로야 진노스케", 12600, "9788901225395", "걷는나무");
		
		Book cartoon = new Book("BK003", "원피스 ONE PIECE 89권", "오다 에이이치로", 4500, "9791133482955", "대원 ");

		manager.insert(stockBook);
		manager.insert(essay);
		manager.insert(cartoon);

		System.out.println("=========");
		
		manager.select();
		
		System.out.println("- 가격 검색 -");
		manager.select(15000, 20000);
		System.out.println("- 키워드 검색 - ");
		manager.select("민폐");
		System.out.println("- 총 권수 -");
		manager.totalCount();
		System.out.println("=========");
		
		Book essay2 = new Book("BK002", "이제부터 민폐 좀 끼치고 살겠습니다", "진노스케 코고로야", 10100, "9788901225395", "걷는나무");
		manager.update(essay2);
		System.out.println("=========");
		manager.select(essay2);
		System.out.println("=========");
		
		manager.delete(stockBook);
		manager.select();
		
		System.out.println("- 전체 갯수 -");
		manager.totalCount();
		System.out.println("- 전체 삭제 -");
		manager.delete();
		manager.totalCount();
	}

}
