package com.spring.dao;

import java.util.List;
import com.spring.entity.Product;

public interface ProductDao {
	public List<Product> getAllProducts();
	public Product getProductsById(int id);
	public List<String> getAllProductNames();
	public String getProductNameById(int id);
	
	public void deleteByProductNm(String name);
	public void deleteByCategoryNm(String name);
	public void deleteByProductId(int id);
	
	public void updateProductPrice(int id , int newPrice);
	public void updateProductName(int id , String newPName);
	
	public void addProducts(Product pr);
}
