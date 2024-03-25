package com.spring.dao;

import java.util.List;
import com.spring.entity.Product;

public interface ProductDao {
	public Product findById(int id);
	public String getProductName(int id);
	
	public void addProduct(Product pr);
	public void updateProductPrice(int id,int newPrice);
	public void deleteProductById(int id);
	
	public List<Product> getAllProducts();
	public List getAllPrNames();
	
	//add method
//	public List<Product> findByPriceRange(int min,int max);
//	public List<Product> findProdGreaterThanId(int id);
//	public List<Product> findByNameAndPriceRange(String pNm,int min,int max);
//	
//	public void deleteByName(String name);
//	public void updateName(int id,String newName);
	
}
