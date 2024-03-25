package com.spring.entity;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("prototype")
public class Employee {
	private int empId;
	private String empName;
	private int empSal;
	
	public Employee() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee Id : ");
			int empId = sc.nextInt();
			System.out.println("Enter Employee Name : ");
			String empName = sc.nextLine();
			empName = sc.nextLine();
			System.out.println("Enter Employee Salary : ");
			int empSal = sc.nextInt();
			Employee emp = new Employee(empId, empName, empSal);
			System.out.println(emp);
			
	}

	public Employee(int empId, String empName, int empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
}
