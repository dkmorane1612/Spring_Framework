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


import com.spring.entity.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Product> getAllProducts() {
		String query = "Select * from product";      //dbName - products
		List<Product> listProds = template.query(query, new RowMapper<Product>() {
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
		
		return listProds;
	}

	@Override
	public Product getProductsById(int id) {
		String query = "select * from product where pId = ?";     //dbName - products
		Product dataOfpr = template.query(query,new Object[] { id }, new ResultSetExtractor<Product>() {

			@Override
			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				Product pr = new Product();
				
				if(rs.next()) {
					pr.setpId(rs.getInt(1));        //getObject(1)
					pr.setpName(rs.getString(2));    
					pr.setPrice(rs.getInt(3)); 
					pr.setCategory(rs.getString(4));
				}
				return pr;
			}
			});
		
		return dataOfpr;
	}

	@Override
	public List<String> getAllProductNames() {
		String query = "select pName from Product";    //dbName - products
		List<String> listPrNames = template.query(query,new RowMapper<String>() {

			@Override
			public String mapRow(ResultSet rs, int arg1) throws SQLException {
				String ProductName = rs.getString(2);    //getString(1)
				return ProductName;
			}
		});
		return listPrNames;
	}

	@Override
	public String getProductNameById(int id) {
		String query = "select pName from product where pId = ?";     //dbName - products
		String listprNames = template.query(query,new Object[] { id }, new ResultSetExtractor<String>() {

			@Override
			public String extractData(ResultSet rs) throws SQLException, DataAccessException {
					String pr = rs.getString(2);   
				    return pr;
			}
			});
		
		return listprNames;
	}

	@Override
	public void deleteByProductNm(String name) {
		String query = "delete from product where pName= ?";    //dbName - products
		template.update(query, new Object[] { name });

		
	}

	@Override
	public void deleteByCategoryNm(String name) {
		String query = "delete from product where Category = ?";
		template.update(query, new Object[] { name });
		
	}

	@Override
	public void deleteByProductId(int id) {
		String query = "delete from product where pId = ?";
		template.update(query, new Object[] { id });
		
	}

	@Override
	public void updateProductPrice(int id, int newPrice) {
		String query = "update product set Price = ? where pId= ? ";
		template.update(query, new Object[] {newPrice,id });
		
	}

	@Override
	public void updateProductName(int id, String newPName) {
		String query = "update product set pName = ? where pId= ? ";
		template.update(query, new Object[] {newPName,id });
		
	}

	@Override
	public void addProducts(Product pr) {
		String query = "insert into product values (?, ?, ?, ?)";        //dbName - products
		template.update(query, new Object[] {pr.getpId(),pr.getpName(),pr.getPrice(),pr.getCategory() });
		
	}

}
