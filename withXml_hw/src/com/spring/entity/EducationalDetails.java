package com.spring.entity;

public class EducationalDetails {
	private String qualification;
	private String result;
	private int yearOfPassing;
	
	public EducationalDetails() {
		
	}

	public EducationalDetails(String qualification, String result, int yearOfPassing) {
		this.qualification = qualification;
		this.result = result;
		this.yearOfPassing = yearOfPassing;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	@Override
	public String toString() {
		return "EducationalDetails [qualification=" + qualification + ", result=" + result + ", yearOfPassing="
				+ yearOfPassing + "]";
	}
		
}
