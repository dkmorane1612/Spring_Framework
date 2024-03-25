package com.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	private int bkId;
	private String bkName;
	private double bkPrice;
	
	//private MyDate publishedDate;
	
	public Book() {
		
	}
	
	@Autowired
	public Book(int bkId, String bkName, double bkPrice) {
		this.bkId = bkId;
		this.bkName = bkName;
		this.bkPrice = bkPrice;
	}

	public int getBkId() {
		return bkId;
	}

	public void setBkId(int bkId) {
		this.bkId = bkId;
	}

	public String getBkName() {
		return bkName;
	}

	public void setBkName(String bkName) {
		this.bkName = bkName;
	}

	public double getBkPrice() {
		return bkPrice;
	}

	public void setBkPrice(double bkPrice) {
		this.bkPrice = bkPrice;
	}

	@Override
	public String toString() {
		return "Book [bkId=" + bkId + ", bkName=" + bkName + ", bkPrice=" + bkPrice + "]";
	}

		
}
