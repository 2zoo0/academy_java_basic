package book.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import book.vo.Book;

public class SetBookShelf implements BookShelf {

	// 멤변
	private Set<Book> books;

	// 생성자
	public SetBookShelf() {
	}

	public SetBookShelf(Set<Book> books) {
		super();
		this.books = books;
	}

	// 메소드
	@Override
	public int insert(Book book) {
		int successCnt = 0;
		
		boolean success = books.add(book);
		if (success) {
			successCnt++;
		}
		
		return successCnt;
	} // end insert(Book book)
	

	@Override
	public int update(Book book) {
		int result = -1;
		
		boolean success = books.contains(book);
		int successCnt = 0;
		if (success) {
			books.remove(book);
			books.add(book);
			result = 1;
		}
		
		return successCnt;
	} // end update(Book book)
	

	@Override
	public int delete(Book book) {
		books.add(book);
		
		int result = -1;
		if (books.contains(book)) {
			books.remove(book);
			result = 1;
		}
		
		return result;
	} // end delete(Book book)
	
	
	@Override
	public Book select(Book book) {
		Book found = null;
		
		for (Book book2 : books) {
			if (book2.equals(book)) {
				found = book2;
				break;
			}
		}
		
		return found;
	} // end select(Book book)
	

	@Override
	public List<Book> select() {
		List<Book> books = new ArrayList<Book>();
		
		for (Book boo : this.books) {
				books.add(boo);
			}
		
		return books;
	}// end select()

	@Override
	public List<Book> select(int low, int high) {
		// TODO Auto-generated method stub
		List<Book> books = null;
		
		return books;
	}

	@Override
	public List<Book> select(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int totalCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}
}
