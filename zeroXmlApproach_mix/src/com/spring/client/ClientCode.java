package com.spring.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ZeroXmlApproachMix;
import com.spring.entity.Player;


public class ClientCode {

	public static void main(String[] args) {
		 ApplicationContext appCon= new AnnotationConfigApplicationContext(ZeroXmlApproachMix.class);
		 
		Player p1 = (Player) appCon.getBean("play1");
		System.out.println(p1);
		//System.out.println(p1.hashCode());
		
		Player p2 = (Player) appCon.getBean("play2");
		System.out.println(p2);
		//System.out.println(p2.hashCode());
		
		Player p3 = (Player) appCon.getBean("play");
		System.out.println(p3);
		//System.out.println(p3.hashCode());
		
		Player p4 = (Player) appCon.getBean("play",133,"Raj Verma",23);
		System.out.println(p4);
		//System.out.println(p4.hashCode());
		
		Player p5 = (Player) appCon.getBean("play2");
		System.out.println(p5);
		//System.out.println(p5.hashCode());
		
		
		
	}

}
