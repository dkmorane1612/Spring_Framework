package com.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
	private int pId;
	private String pName;
	private int price;
	private String category;
	
	public Product() {
		
	}

	@Autowired
	public Product(int pId, String pName, int price, String category) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.category = category;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price + ", category=" + category + "]";
	}
	
}
