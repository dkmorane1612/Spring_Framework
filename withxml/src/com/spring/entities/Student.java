package com.spring.entities;

public class Student {
	private int studId;
	private String studName;
	private int age;
	
	private Address resAdd;

	public Student() {
	
	}

	public Student(int studId, String studName, int age, Address resAdd) {
		this.studId = studId;
		this.studName = studName;
		this.age = age;
		this.resAdd = resAdd;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getResAdd() {
		return resAdd;
	}

	public void setResAdd(Address resAdd) {
		this.resAdd = resAdd;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", age=" + age + ", resAdd=" + resAdd + "]";
	}
}
