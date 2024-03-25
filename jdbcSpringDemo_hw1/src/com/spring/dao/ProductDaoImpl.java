package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.entity.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Product> getAllProducts() {
		String query = "Select * from products";
		List<Product> listBooks = template.query(query, new RowMapper<Product>() {
			@Override
			public Product mapRow(ResultSet rs, int noOfRows) throws SQLException {
				Product pr = new Product();
				pr.setpId(rs.getInt(1));        //getObject(1)
				pr.setpName(rs.getString(2));    
				pr.setPrice(rs.getInt(3)); 
				pr.setCategory(rs.getString(4));
				
				return pr;
			}
		});
		
		return listBooks;
	}

	@Override
	public Product getProductsById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllProductNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProductNameById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByProductNm(String name) {
		String query = "delete from products where pName= ?";
		template.update(query, new Object[] { name });

		
	}

	@Override
	public void deleteByCategoryNm(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByProductId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProductPrice(int id, int newPrice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProductName(int id, String newPName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProducts(Product pr) {
		String query = "insert into products values (?, ?, ?, ?)";
		template.update(query, new Object[] {pr.getpId(),pr.getpName(),pr.getPrice(),pr.getCategory() });
		
	}

}
