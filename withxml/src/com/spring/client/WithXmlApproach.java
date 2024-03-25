package com.spring.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.spring.entities.Address;
import com.spring.entities.Student;


public class WithXmlApproach {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(".\\src\\springConfig.xml"));
		Student stud1 = (Student) factory.getBean("stud1");
		System.out.println(stud1);
		System.out.println(stud1.hashCode());
		System.out.println("--------------------------------------------");
		
		Student stud2 = (Student) factory.getBean("stud2", 12, "Praful", 24, (Address)factory.getBean("add2","Gangapur Road","Nashik","Maharashtra","India",301216));
		System.out.println(stud2);
		System.out.println(stud2.hashCode());
		System.out.println("--------------------------------------------");
	}

}
