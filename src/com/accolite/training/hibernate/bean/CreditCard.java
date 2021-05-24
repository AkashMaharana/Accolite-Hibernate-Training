package com.accolite.training.hibernate.bean;

import java.util.Calendar;

public class CreditCard {
	
	private String creditCardNumber;
	private String  creditCardProvider;
	private double creditLimit;
	private String creditCardHolderName;
	private Calendar expiryDate;
	private int cvv;
	private MobileNumber mobileNumber;
	
	// put constructor as required or use getter and setter
	
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getCreditCardProvider() {
		return creditCardProvider;
	}
	public void setCreditCardProvider(String creditCardProvider) {
		this.creditCardProvider = creditCardProvider;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getCreditCardHolderName() {
		return creditCardHolderName;
	}
	public void setCreditCardHolderName(String creditCardHolderName) {
		this.creditCardHolderName = creditCardHolderName;
	}
	public Calendar getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Calendar expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public MobileNumber getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(MobileNumber mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String toString() {
		return "CreditCard [creditCardNumber=" + creditCardNumber + ", creditCardProvider=" + creditCardProvider
				+ ", creditLimit=" + creditLimit + ", creditCardHolderName=" + creditCardHolderName + ", expiryDate="
				+ expiryDate + ", cvv=" + cvv + ", mobileNumber=" + mobileNumber + "]";
	}
	
}
