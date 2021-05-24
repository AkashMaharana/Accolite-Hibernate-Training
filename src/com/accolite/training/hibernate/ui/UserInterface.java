package com.accolite.training.hibernate.ui;

import com.accolite.training.hibernate.bean.CreditCard;
import com.accolite.training.hibernate.bean.MobileNumber;
import com.accolite.training.hibernate.service.CreditCardService;
import com.accolite.training.hibernate.service.MobileNumberService;
import com.accolite.training.hibernate.service.UtilityService;

public class UserInterface {
	
	public static void main(String[] args) {
		
		addMobileNumber();
		addCreditCard();
		updateMobileNumberDetails();
		updateCreditCardDetails();
		getMobileNumberDetails();
		getCreditCardDetails();
		
	}
	
	private static CreditCardService creditCardService=new CreditCardService();
	private static MobileNumberService mobileNumberService = new MobileNumberService();
	private static UtilityService utilityService = new UtilityService();
	
	private static CreditCard getCreditCardDetails() {
		//pass you input here
		return null;
	}

	private static MobileNumber getMobileNumberDetails() {
		//pass you input here
		return null;
	}

	private static CreditCard updateCreditCardDetails() {
		//pass you input here
		return null;
	}

	private static MobileNumber updateMobileNumberDetails() {
		//pass you input here
		return null;
	}

	public static MobileNumber addMobileNumber() {
		//pass you input here
		return null;
	}
	
	public static CreditCard addCreditCard() {
		//pass your input here
		return null;
	}
	
	public void displayMobileNumberAndCreditCardDetails() {
		UserInterface.utilityService.displayMobileNumberAndCreditCardDetails();
	}
	
	public void displayNumberOfCreditCardWithEachPersonAscendingOrderOfTheirName() {
		UserInterface.utilityService.displayNumberOfCreditCardWithEachPersonAscendingOrderOfTheirName();
	}

}
