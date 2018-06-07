
package com.training.domains;

import java.util.Date;

public class Donar {

    private String name;
    private long mobileNumber;
    private String gender;
    private String bloodGroup;
    private String location;
    private Date dateOfBirth;
    
	public Donar() {
		super();
	
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Donar(String name, long mobileNumber, String gender, String bloodGroup, String location,Date dateOfBirth) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.location = location;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Donar [name=" + name + ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", bloodGroup="
				+ bloodGroup + ", location=" + location + "]";
	}
    
	
    
    
}

