package com.spring.dao;

import java.sql.PreparedStatement;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.entity.Product;

@Repository("proDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory factory;
	
	public Session getSession() {
		return factory.getCurrentSession();
	}

	@Override
	public Product findById(int id) {
		return (Product) getSession().get(Product.class, id) ;
	}

	@Override
	public String getProductName(int id) {
		String prod = (String) getSession().get(Product.class, id);
		return prod;
	}

	@Override
	public void addProduct(Product pr) {
		getSession().save(pr);
		System.out.println("Product added successfully");
	}

	@Override
	public void updateProductPrice(int id, int newPrice) {
		Product prod = (Product) getSession().get(Product.class,id);
		prod.setPrice(newPrice);		
	}

	@Override
	public void deleteProductById(int id) {
		getSession().delete(id);
		
	}

	@Override
	public List<Product> getAllProducts() {
		String query ="from Product";
		Query q = getSession().createQuery(query);
		List<Product> lstProd = q.list();
		
		return lstProd;
	}

	@Override
	public List<String> getAllPrNames() {
		String query = "select pName from Product";
		Query q = getSession().createQuery(query);
		List<String> lstProd = q.list();
		return lstProd;
	}

//	@Override
//	@Transactional
//	public List<Product> findByPriceRange(int min, int max) {
//		String query ="from Product where price BETWEEN min := n and max := m";
//		query.setParam
//		Query q = getSession().createQuery(query);
//		List<Product> lstProd = q.list();
//		
//		return lstProd;
//	}
//
//	@Override
//	public List<Product> findProdGreaterThanId(int id) {
//		String query ="from Product where pId > 2";
//		Query q = getSession().createQuery(query);
//		List<Product> lstProd = q.list();
//		
//		return lstProd;
//	}
//
//	@Override
//	public List<Product> findByNameAndPriceRange(String pNm, int min, int max) {
//		String query ="from Product where pName = n ";
//		query.setP
//		
//		Query q = getSession().createQuery(query);
//		List<Product> lstProd = q.list();
//		
//		return lstProd;
//	}
//
//	@Override
//	public void deleteByName(String name) {
//		getSession().delete(name);
//		
//	}
//
//	@Override
//	public void updateName(int id, String newName) {
//		Product prod = (Product) getSession().get(Product.class,id);
//		prod.setpName(newName);
//   }
		
}
