package com.accolite.training.hibernate.dao;

import com.accolite.training.hibernate.entity.CreditCardEntity;

public class CreditCardDAO {
	
	/*
	 	call credit card dao from credit card service.
	 	To interact with the DAO layer from Service layer use entity 
	 	To interact with the Service layer from DAO layer use bean
	*/
	
	public CreditCardEntity saveCreditDetails(CreditCardEntity creditCard) {
		//write you code here. call to the database layer and do the appropriate conversion if required.
		return null;
	}

	public CreditCardEntity getCreditCardDetails(String creditCardNumber) {
		//write you code here. call to the database layer and do the appropriate conversion if required.
		return null;
	}

	public CreditCardEntity updateCreditCardDetails(String creditCardNumber, CreditCardEntity updatedCreditCardEntity) {
		//write you code here. call to the database layer and do the appropriate conversion if required.
		return null;
	}

}
