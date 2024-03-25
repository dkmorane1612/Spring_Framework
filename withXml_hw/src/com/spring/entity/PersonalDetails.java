package com.spring.entity;


public class PersonalDetails {
	private String fName;
	private String lName;
	private String email;
	private double contactNo;
	private String gender;
	private String birthDate;
	
	private Address resAdd;

	public PersonalDetails() {
		
	}

	public PersonalDetails(String fName, String lName, String email, double contactNo, String gender, String birthDate,
			Address resAdd) {
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.contactNo = contactNo;
		this.gender = gender;
		this.birthDate = birthDate;
		this.resAdd = resAdd;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getContactNo() {
		return contactNo;
	}

	public void setContactNo(double contactNo) {
		this.contactNo = contactNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public Address getResAdd() {
		return resAdd;
	}

	public void setResAdd(Address resAdd) {
		this.resAdd = resAdd;
	}

	@Override
	public String toString() {
		return "PersonalDetails [fName=" + fName + ", lName=" + lName + ", email=" + email + ", contactNo=" + contactNo
				+ ", gender=" + gender + ", birthDate=" + birthDate + ", resAdd=" + resAdd + "]";
	}
	
}
