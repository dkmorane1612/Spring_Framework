package com.spring.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.entity.Employee;

@Configuration
public class ZeroXmlApproach {
	
	@Bean(name = "emp1")
	@Scope("prototype")
	public Employee m1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		int empId = sc.nextInt();
		System.out.println("Enter Employee Name : ");
		String empName = sc.nextLine();
		empName = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		int empSal = sc.nextInt();
		
		Employee emp = new Employee(empId, empName, empSal);
		return emp;
	}
	
	@Bean(name = "emp2")
	@Scope("prototype")
	public Employee m2() {
		Employee emp = new Employee();
		emp.setEmpId(11);
		emp.setEmpName("Raj Verma");
		emp.setEmpSal(110000);
		
		return emp;
	}
}
