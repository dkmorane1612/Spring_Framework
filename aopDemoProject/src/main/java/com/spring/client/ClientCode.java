package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AopConfig;
import com.spring.entity.Dummy;
import com.spring.entity.DummyClassFile;

public class ClientCode {

	public static void main(String[] args) {
		ApplicationContext cont=new AnnotationConfigApplicationContext(AopConfig.class);
		Dummy dm=(Dummy) cont.getBean(Dummy.class);
		dm.m3();
		DummyClassFile dcf=cont.getBean(DummyClassFile.class);
		dcf.m1();

	}

}
