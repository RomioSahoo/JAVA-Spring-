package com.spring.app;

import java.util.Date;

public class Passport 
{
	private int passNum;
	private Date dateOfIssue;
	private Date dateOfExpiry;
	
	public int getPassNum() {
		return passNum;
	}
	public void setPassNum(int passNum) {
		this.passNum = passNum;
	}
	public Date getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	@Override
	public String toString() {
		return "Passport [passNum=" + passNum + ", dateOfIssue=" + dateOfIssue + ", dateOfExpiry=" + dateOfExpiry + "]";
	}
}
	 	  	    	    	     	      	 	
