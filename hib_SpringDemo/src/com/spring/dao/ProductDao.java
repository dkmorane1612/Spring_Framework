package com.spring.dao;

import java.sql.Date;
import java.util.List;

import com.spring.entity.Product;

public interface ProductDao {
            
	public Product findById(int id);
	public String getProductInfo(int id);
	public void deleteByProductNm(String name);
	public void updateProductPrice(int id, double newPrice);
	public void addProduct(Product prod);
	public List<Product> getAllProducts();
	public List getAllNames();
	public void updateName(int id,String newName);
	public void updateExpDate(int id,Date newExpDate);
	public Date getExpDate(int id);
	public List<Product> findByPriceRange(double min,double max);
	public List<Product> findProdGreaterThanId(int id);
   	public List<Product> findByNameAndPriceRange(String proNm,double min,double max);
	
}
