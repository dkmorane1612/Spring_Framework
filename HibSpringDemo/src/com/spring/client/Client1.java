package com.spring.client;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.HibConfig;
import com.spring.dao.ProductDao;
import com.spring.entity.Product;

public class Client1 {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibConfig.class);
		
		ProductDao pd= (ProductDao) context.getBean("proDao");
		
		//pd.addProduct(new Product(100, "Ps5", 37000);
		
		
		/*List<String> lstprod=pd.getAllNames();
		for(String i:lstprod) {
			System.out.println(i);
		}*/
		
//		pd.deleteByProductNm("Ps5");
        
	}

}
