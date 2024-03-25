package com.spring.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.SpringConfig;
import com.spring.dao.BookDao;
import com.spring.entity.Book;

public class Client1 {

	public static void main(String[] args) {
		ApplicationContext conText = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		BookDao dao = (BookDao) conText.getBean("bookDao");
		
//		dao.addBooks(new Book(21,"Thinking in Java", 450));
//		dao.addBooks(new Book(22,"Programming in C", 200));
//		dao.addBooks(new Book(23,"Web Technology", 570));
//		dao.addBooks(new Book(24,"Core Java", 360));
//		
//		dao.updateBookPrice(22, 350);
//		dao.deleteByBookNm("Core Java");
		
//		List<Book> listBooks = dao.getAllBooks();
//		for(Book i : listBooks)
//		{
//			System.out.println(i);
//		}
		
//		List<String> listBkNm = dao.getAllBookNames();
//		for(String i : listBkNm)
//		{
//			System.out.println(i);
//		}
		
		Book Book = dao.getBooksById(21);
			System.out.println(Book);
		
	}

}
