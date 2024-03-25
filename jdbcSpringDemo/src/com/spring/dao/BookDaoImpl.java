package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.entity.Book;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
	
	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Book> getAllBooks() {
		String query = "Select * from books";
		List<Book> listBooks = template.query(query, new RowMapper<Book>() {
			@Override
			public Book mapRow(ResultSet rs, int noOfRows) throws SQLException {
				Book bk = new Book();
				bk.setBkId( rs.getInt(1));        //getObject(1)
				bk.setBkName(rs.getString(2));    
				bk.setBkPrice(rs.getDouble(3));  
				
				return bk;
			}
		});
		
		return listBooks;
	}

	@Override
	public Book getBooksById(int id) {
		String query = "select * from books where bkid = ?";
		Book dataOfBk = template.query(query,new Object[] { id }, new ResultSetExtractor<Book>() {

			@Override
			public Book extractData(ResultSet rs) throws SQLException, DataAccessException {
				Book bk = new Book();
				
				if(rs.next()) {
					bk.setBkId(rs.getInt(1));
					bk.setBkName(rs.getString(2));
					bk.setBkPrice(rs.getDouble(3));
				}
				return bk;
			}
			});
		
		return dataOfBk;
	}

	@Override
	public List<String> getAllBookNames() {
		String query = "select bkname from books";
		List<String> listbkNames = template.query(query,new RowMapper<String>() {

			@Override
			public String mapRow(ResultSet rs, int arg1) throws SQLException {
				String bookName = rs.getString(1);
				return bookName;
			}
		});
		return listbkNames;
	}

	@Override
	public void deleteByBookNm(String name) {
		String query = "delete from books where bkName= ?";
		template.update(query, new Object[] { name });
	}

	@Override
	public void updateBookPrice(int id, double newPrice) {
		String query = "update books set bkPrice = ? where bkId= ? ";
		template.update(query, new Object[] {newPrice,id });
		
	}

	@Override
	public void addBooks(Book bk) {
		String query = "insert into books values (?, ?, ?)";
		template.update(query, new Object[] {bk.getBkId(),bk.getBkName(),bk.getBkPrice() });
	}

	public String getBookNameById(int id) {
		String query = "select bkname from books where bkid = ?";
		String bookNm = template.queryForObject(query,new Object[] {id},String.class);
		
		return bookNm;
	}

}
