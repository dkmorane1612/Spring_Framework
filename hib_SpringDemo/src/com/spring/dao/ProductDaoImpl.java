 package com.spring.dao;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.entity.Product;
@Repository("proDao")
@Transactional
public class ProductDaoImpl implements ProductDao{
    @Autowired
    SessionFactory factory;
    Scanner sc=new Scanner(System.in);
    //will be called again and again to process each and every hib functionality
    public Session getSession() {
    	return factory.getCurrentSession();
    }
	@Override
	public Product findById(int id) {
		return (Product) getSession().get(Product.class,id);
	}

	@Override
	public String getProductInfo(int id) {
		String prod=(String) getSession().get(Product.class,id);
		return prod;
	}

	@Override
	public void deleteByProductNm(String name) {
           getSession().delete(name);		
		
	}

	@Override
	public void updateProductPrice(int id, double newPrice) {
           Product prod=(Product) getSession().get(Product.class, id);
           prod.setPrice(newPrice);
 				
	}

	@Override
	public void addProduct(Product prod) {
		getSession().save(prod);
	    System.out.println("Product added successfully");
	}

	@Override
	public List<Product> getAllProducts() {
        String query="from Product";
		Query q= getSession().createQuery(query);
		List<Product> lstProd=q.list();
		return lstProd;
	}

	@Override
	public List getAllNames() {
		String query="select proNm from Product";
		Query q=getSession().createQuery(query);
		List lstProd=q.list(); 
		return lstProd;
	}
	@Override
	public void updateName(int id, String newName) {
		Product prod=(Product) getSession().get(Product.class, id);
		prod.setProNm(newName);		
	}
	@Override
	public void updateExpDate(int id, Date newExpDate) {
		Product prod=(Product) getSession().get(Product.class, id);
		prod.setExpDate(newExpDate);
	}
	@Override
	public Date getExpDate(int id) {
		// TODO Auto-generated method stub
		Date dt=(Date) getSession().get(Product.class,id);
		return dt;	
		}
	@Override
	public List<Product> findByPriceRange(@Param double min,@Param double max) {
		String query="from Product where price between ? and ?";
		Query q=getSession().createQuery(query);
		List<Product> lstProd=q.list();
		return lstProd;	
	}
	@Override
	public List<Product> findProdGreaterThanId(int id) {
		String query="from Product where proId>:id";
		Query q=getSession().createQuery(query);
		return q.list();
	}
	@Override
	public List<Product> findByNameAndPriceRange(String proNm, double min, double max) {
		String query="from Product where price between ? and ?";
		Query q=getSession().createQuery(query);
		return q.list();
	}

}
