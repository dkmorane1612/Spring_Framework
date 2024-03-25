package com.spring.entity;

import javax.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private int pId;
	@Column(name ="product_Name",length = 35)
	private String pName;
	private int price;
	
	public Product() {
		
	}

	@Autowired
	public Product(int pId, String pName, int price) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
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

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price + "]";
	}
	
}
