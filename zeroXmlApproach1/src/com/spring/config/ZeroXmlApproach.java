package com.spring.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.entity.Employee;

@Configuration
@ComponentScan("com.spring.entity")
public class ZeroXmlApproach {
	
}
