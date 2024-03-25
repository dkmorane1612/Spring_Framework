package com.spring.dao;

import java.util.List;
import com.spring.entity.Book;

public interface BookDao {
	
	public List<Book> getAllBooks();
	public Book getBooksById(int id);
	public List<String> getAllBookNames();
	public String getBookNameById(int id);
	
	public void deleteByBookNm(String name);
	
	public void updateBookPrice(int id , double newPrice);
	
	public void addBooks(Book bk);
	
}
