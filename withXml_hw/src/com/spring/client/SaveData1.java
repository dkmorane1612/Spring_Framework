package com.spring.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.spring.entity.Address;
import com.spring.entity.EducationalDetails;
import com.spring.entity.PersonalDetails;
import com.spring.entity.Profile;


public class SaveData1 {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(".\\src\\springConfig.xml"));
		
		Profile prof1 =(Profile) factory.getBean("prof1");
		System.out.println(prof1);
		System.out.println(prof1.hashCode());
		System.out.println("--------------------------------------------");
		
		Profile prof2 =(Profile) factory.getBean("prof2");
		System.out.println(prof2);
		System.out.println(prof2.hashCode());
		System.out.println("--------------------------------------------");
		
		Profile prof3 =(Profile) factory.getBean("prof3",103,"22-09-2017",
				(PersonalDetails)factory.getBean("perDetail3","Viru","Ahire","viru@gmail.com",8307053278d,"Male","16-05-2005",
						(Address)factory.getBean("add3","Ambad Road","Nashik","India",443201)),
				(EducationalDetails)factory.getBean("eduDetail3","BE Pharm","Pass",2019));
		System.out.println(prof3);
		System.out.println(prof3.hashCode());
		System.out.println("--------------------------------------------");

	}

}
