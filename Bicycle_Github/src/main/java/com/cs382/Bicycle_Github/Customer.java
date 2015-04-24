package com.cs382.Bicycle_Github;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Customer {
	@Column(nullable=false)
	private String citizenID;
	private String fname;
	private String lname;
	
	public String getCitizenID() {
		return citizenID;
	}
	public void setCitizenID(String citizenID) {
		this.citizenID = citizenID;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
}
