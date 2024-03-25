package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.HibConfig;
import com.spring.dao.ProductDao;
import com.spring.entity.Product;

public class CrudData {

	public static void main(String[] args) {
		
		ApplicationContext conText = new AnnotationConfigApplicationContext(HibConfig.class);

		ProductDao dao = (ProductDao) conText.getBean("proDao");
		
		dao.addProduct(new Product(21,"Washing Machine",15500));
		dao.addProduct(new Product(22,"Freeze",13000));
		dao.addProduct(new Product(23,"Speaker Dollby",3700));
		dao.addProduct(new Product(24,"Smart Watch",1200));
		dao.addProduct(new Product(25,"AC",24300));
	}

}
