package com.spring.entity;

public class Address {
	private String street;
	private String city;
	private String country;
	private int pinCode;
	
	public Address() {
		
	}

	public Address(String street, String city, String country, int pinCode) {
		this.street = street;
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + ", pinCode=" + pinCode + "]";
	}
		
}
