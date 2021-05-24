package com.accolite.training.hibernate.service;

import com.accolite.training.hibernate.bean.MobileNumber;
import com.accolite.training.hibernate.dao.MobileNumberDAO;

public class MobileNumberService {
	
	private MobileNumberDAO mobileDAO=new MobileNumberDAO();
	
	/*
	 	call credit card dao from credit card service.
	 	To interact with the DAO layer from Service layer use entity 
	 	To interact with the Service layer from DAO layer use bean
	*/
	
	public MobileNumber addMobileNumberDetails(MobileNumber mobileNumber) {
		//write you code here. call to the database layer and do the appropriate conversion if required.
		return null;
	}
	
	public MobileNumber getMobileNumberDetails(String mobileNumber) {
		//write you code here. call to the database layer and do the appropriate conversion if required.
		return null;
	}
	
	public MobileNumber updateMobileNumberDetails(String mobileNumber, MobileNumber updatedMobileNumberDetails) {
		//write you code here. call to the database layer and do the appropriate conversion if required.
		return null;
	}

}
