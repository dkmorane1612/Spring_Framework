package com.spring.entity;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class AspectOrientedCode {
	@Before("execution(public void m*())")
	public void methBed() {
		System.out.println("bef business method");
	}
	@After("execution(public void m*())")
	public void methAfter() {
		System.out.println("After business method");
	}

}
