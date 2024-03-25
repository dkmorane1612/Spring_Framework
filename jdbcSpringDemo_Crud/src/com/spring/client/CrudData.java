package com.spring.client;

import java.util.List;
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
		// System.out.println("Do you want to continue operation y/n :");

		Scanner sc = new Scanner(System.in);

		int ope ;
		do {
			System.out.println("Enter 1 to Add Product ");
			System.out.println("Enter 2 to Delete Product ");
			System.out.println("Enter 3 to Update Product");
			System.out.println("Enter 4 for View Product Data");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Product Id :");
				int id = sc.nextInt();
				System.out.println("Enter Product Name : ");
				String pname = sc.nextLine();
				pname = sc.nextLine();
				System.out.println("Enter Product Price : ");
				int price = sc.nextInt();
				System.out.println("Enter Product Category : ");
				String cat = sc.nextLine();
				cat = sc.nextLine();
				dao.addProducts(new Product(id, pname, price, cat));
				System.out.println("Product added successfully..!");
				break;
			case 2:
				System.out.println("Enter 1 for Delete Product By Id ");
				System.out.println("Enter 2 for Delete Product By pName ");
				System.out.println("Enter 3 for Delete Product By Category ");
				System.out.println("Enter your choice : ");
				int ch1 = sc.nextInt();
				switch (ch1) {
				case 1:
					System.out.println("Enter Product Id to delete Product :");
					int pId = sc.nextInt();
					dao.deleteByProductId(pId);
					System.out.println("Product delete Successfully");
					break;
				case 2:
					System.out.println("Enter Product Name to delete Product :");
					String pNm = sc.nextLine();
					pNm = sc.nextLine();
					dao.deleteByProductNm(pNm);
					System.out.println("Product delete Successfully");
					break;
				case 3:
					System.out.println("Enter Category to delete Product :");
					String pCat = sc.nextLine();
					pCat = sc.nextLine();
					dao.deleteByCategoryNm(pCat);
					System.out.println("Product delete Successfully");
					break;
				default:
					System.out.println("Enter Valid Choice...");
					break;
				}
				break;
			case 3:
				System.out.println("Enter 1 for Update price of product ");
				System.out.println("Enter 2 for Update Name of product ");
				System.out.println("Enter your choice : ");
				int ch2 = sc.nextInt();
				switch (ch2) {
				case 1:
					System.out.println("Enter Product Id to update Product Price : ");
					int pId = sc.nextInt();
					System.out.println("Enter new price of Product : ");
					int newPrice = sc.nextInt();
					dao.updateProductPrice(pId, newPrice);
					System.out.println("Product Price Updated Successfully");
					break;
				case 2:
					System.out.println("Enter Product Id to update Product Name : ");
					int pId1 = sc.nextInt();
					System.out.println("Enter new Name of Product : ");
					String newName = sc.nextLine();
					newName = sc.nextLine();
					dao.updateProductName(pId1, newName);
					System.out.println("Product Price Updated Successfully");
					
					break;
				default:
					System.out.println("Enter Valid Choice...");
					break;
				}
				break;
			case 4:
				System.out.println("Enter 1 to show all Product Data");
				System.out.println("Enter 2 to show all Product Names");
				System.out.println("Enter 3 to show  Product Data by Id");
				System.out.println("Enter your choice");
				int ch3 = sc.nextInt();
				switch (ch3) {
				case 1:
					List<Product> lstPrs = dao.getAllProducts();
					for (Product i : lstPrs) {
						System.out.println(i);
					}
					break;
				case 2:
					//not run--error
					List<String> listprNm = dao.getAllProductNames();
					for (String i : listprNm) {
						System.out.println(i);
					}
					break;
				case 3:
					System.out.println("Enter Product Id for Show Data :");
					int pId = sc.nextInt();
					Product pr2 = dao.getProductsById(pId);
					System.out.println(pr2);
					break;
				default:
					System.out.println("Enter Valid Choice...");
					break;
				}
				break;
			default:
				System.out.println("Enter Valid Choice...");
				break;

			}
			System.out.println("Continue operations Press 8 : ");
			ope = sc.nextInt();
		} while (ope == 8 );

	}

}
