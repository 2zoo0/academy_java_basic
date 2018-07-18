package book.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

public class MapBookShelf implements BookShelf {
	
	// 멤변
	private Map<String, Book> books;
	
	
	
	public MapBookShelf() {
		books = new HashMap();
	}
	
	public MapBookShelf(Map<String, Book> books) {
		this.books = books;
	}
	
	
	

	@Override
	public int insert(Book book) throws DuplicateException {
		int successCnt = 0;
		
		if (!isExists(book)) {
			books.put(book.getBookId(), book);
			successCnt++;
			
		} else {
			// 도서가 중복될 때
			throw new DuplicateException("insert", book);
		}
		return successCnt;
	}

	@Override
	public int update(Book book) throws NotFoundException {
		int result = -1;
		
		if (books.containsKey(book.getBookId())) {
			books.put(book.getBookId(), book);
			result = 1;
		} else {
			// 수정 대상이 없을 때
			throw new NotFoundException("update", book);
		}
		
		return result;
	}

	@Override
	public int delete(Book book) throws NotFoundException {
		int result = -1;
		
		if (books.containsKey(book.getBookId())) {
			books.remove(book.getBookId());
			result = 1;
		} else {
			throw new NotFoundException("delete", book);
		}
		
		return result;
	}

	@Override
	public Book select(Book book) throws NotFoundException {
		Book found = null;
		
		if (books.get(book.getBookId()) != null) {
			found = books.get(book.getBookId());
		} else {
			throw new NotFoundException("select", book);
		}
		
		return found;
	}

	@Override
	public List<Book> select() {
		List<Book> books = new ArrayList<Book>();
		Set<String> keySet = this.books.keySet();
		for (String key : keySet) {
			books.add(this.books.get(key));
		}
		return books;
	}

	
	private boolean isExists(Book book) {
		return books.containsKey(book.getBookId());
	}

	@Override
	public List<Book> select(int low, int high) {
		// TODO Auto-generated method stub
		
	}
}
