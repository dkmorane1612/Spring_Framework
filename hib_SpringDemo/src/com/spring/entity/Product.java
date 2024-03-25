package com.spring.entity;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private int proId;
	@Column(length=25)
	private String proNm;
	private double price;
	private Date expDate;
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProNm() {
		return proNm;
	}
	public void setProNm(String proNm) {
		this.proNm = proNm;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proNm=" + proNm + ", price=" + price + ", expDate=" + expDate + "]";
	}
	public Product(int proId, String proNm, double price, Date expDate) {
		super();
		this.proId = proId;
		this.proNm = proNm;
		this.price = price;
		this.expDate = expDate;
	}
	public Product() {
		super();
	}

	
}
