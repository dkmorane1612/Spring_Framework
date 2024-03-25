package com.spring.entity;

public class Profile {
	private int profileId;
	private String creationDate;
	
	PersonalDetails perInfo;
	EducationalDetails eduInfo;

	public Profile() {
		
	}

	public Profile(int profileId, String creationDate, PersonalDetails perInfo, EducationalDetails eduInfo) {
		this.profileId = profileId;
		this.creationDate = creationDate;
		this.perInfo = perInfo;
		this.eduInfo = eduInfo;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public PersonalDetails getPerInfo() {
		return perInfo;
	}

	public void setPerInfo(PersonalDetails perInfo) {
		this.perInfo = perInfo;
	}

	public EducationalDetails getEduInfo() {
		return eduInfo;
	}

	public void setEduInfo(EducationalDetails eduInfo) {
		this.eduInfo = eduInfo;
	}

	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", creationDate=" + creationDate + ", perInfo=" + perInfo
				+ ", eduInfo=" + eduInfo + "]";
	}
	
}
