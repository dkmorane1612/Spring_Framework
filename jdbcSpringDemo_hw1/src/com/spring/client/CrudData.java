package com.spring.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.SpringConfig;
import com.spring.dao.ProductDao;
import com.spring.entity.Product;

public class CrudData {

	public static void main(String[] args) {
		ApplicationContext conText = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		ProductDao dao = (ProductDao) conText.getBean("productDao");
		//System.out.println("Do you want to continue operation y/n :");
		
     	Scanner sc = new Scanner(System.in);
     	
//		System.out.println("Enter Product Id :");
//		int id = sc.nextInt();
//		System.out.println("Enter Product Name : ");
//		String pname = sc.nextLine();
//		pname = sc.nextLine();
//		System.out.println("Enter Product Price : ");
//		int price = sc.nextInt();
//		System.out.println("Enter Product Category : ");
//		String cat = sc.nextLine();
//		cat = sc.nextLine();
//		dao.addProducts(new Product(id,pname, price,cat));
		
		
//		dao.addProducts(new Product(31,"LED Tv", 28900,"Electronics"));
//		dao.addProducts(new Product(32,"Apple 14 pro", 16500,"Electronics"));
//		dao.addProducts(new Product(33,"Shirts", 28900,"Fashion"));
//		dao.addProducts(new Product(34,"Soya Drop", 150,"Grocery"));
//		dao.addProducts(new Product(35,"Sofa Set", 15000,"Furniture"));
//		dao.addProducts(new Product(35,"Nivia Facewash", 230,"Beauty"));
//		dao.addProducts(new Product(35,"Kitchen Set", 6800,"Home"));
//		dao.addProducts(new Product(35,"Jeans49", 1450,"Fashion"));
		
//		dao.updateBookPrice(22, 350);
		System.out.println("Enter Product Name to delete Product :");
		String pNm = sc.next();
		//pNm = sc.nextLine();
		dao.deleteByProductNm(pNm);
		System.out.println("Product delete Successfully");
		
	}

}
