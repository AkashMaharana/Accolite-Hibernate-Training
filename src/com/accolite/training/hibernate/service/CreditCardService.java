package com.accolite.training.hibernate.service;

import com.accolite.training.hibernate.bean.CreditCard;
import com.accolite.training.hibernate.dao.CreditCardDAO;

public class CreditCardService {

	private CreditCardDAO creditCardDAO = new CreditCardDAO();
	
	/*
	 	call credit card dao from credit card service.
	 	To interact with the DAO layer from Service layer use entity 
	 	To interact with the Service layer from DAO layer use bean
	*/

	public CreditCard addCreditCardDetails(CreditCard creditCard) {
		//write you code here. call to the database layer and do the appropriate conversion if required.
		return null;
	}

	public CreditCard getCreditCardDetails(String creditCardNumber) {
		//write you code here. call to the database layer and do the appropriate conversion if required.
		return null;
	}

	public CreditCard updateCreditCardDetails(String creditCardNumber, CreditCard updatedCreditCardDetails) {
		//write you code here. call to the database layer and do the appropriate conversion if required.
		return null;
	}

}
