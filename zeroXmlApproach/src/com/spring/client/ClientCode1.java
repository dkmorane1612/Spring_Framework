package com.spring.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ZeroXmlApproach;
import com.spring.entity.Employee;

public class ClientCode1 {

	public static void main(String[] args) {
		 ApplicationContext appCon= new AnnotationConfigApplicationContext(ZeroXmlApproach.class);
		
//		Employee emp = (Employee) appCon.getBean("emp1");
//		System.out.println(emp);
//		System.out.println(emp.hashCode());
		
		Employee emp2 = (Employee) appCon.getBean("emp2");
		System.out.println(emp2);
		System.out.println(emp2.hashCode());
		
	}

}
