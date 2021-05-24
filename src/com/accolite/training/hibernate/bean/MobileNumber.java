package com.accolite.training.hibernate.bean;

import java.util.List;

public class MobileNumber {
	
	private String mobileNumber;
	private String consumerName;
	private String serviceProvider;
	private String registeredState;
	private boolean isInternetBankingEnabled;
	private int numberOfCreditCardsRegistered;
	private List<CreditCard> allotedCreditCards;
	
	// put constructors as required or use getter and setter to simulate the data
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public String getRegisteredState() {
		return registeredState;
	}
	public void setRegisteredState(String registeredState) {
		this.registeredState = registeredState;
	}
	public boolean isInternetBankingEnabled() {
		return isInternetBankingEnabled;
	}
	public void setInternetBankingEnabled(boolean isInternetBankingEnabled) {
		this.isInternetBankingEnabled = isInternetBankingEnabled;
	}
	public int getNumberOfCreditCardsRegistered() {
		return numberOfCreditCardsRegistered;
	}
	public void setNumberOfCreditCardsRegistered(int numberOfCreditCardsRegistered) {
		this.numberOfCreditCardsRegistered = numberOfCreditCardsRegistered;
	}
	public List<CreditCard> getAllotedCreditCards() {
		return allotedCreditCards;
	}
	public void setAllotedCreditCards(List<CreditCard> allotedCreditCards) {
		this.allotedCreditCards = allotedCreditCards;
	}
	@Override
	public String toString() {
		return "MobileNumber [mobileNumber=" + mobileNumber + ", consumerName=" + consumerName + ", serviceProvider="
				+ serviceProvider + ", registeredState=" + registeredState + ", isInternetBankingEnabled="
				+ isInternetBankingEnabled + ", numberOfCreditCardsRegistered=" + numberOfCreditCardsRegistered
				+ ", allotedCreditCards=" + allotedCreditCards + "]";
	}
	
}
