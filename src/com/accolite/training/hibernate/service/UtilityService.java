package com.accolite.training.hibernate.service;

public class UtilityService {
	
	/*
	 	Please follow the pattern to display the records accordingly.
	 	
	 	Cellular Number|Consumer Name|Credit Card Number|Credit Card Provider|Expiry Date
	 	
	 	The above data set will contain multiple entries of credit card for a single mobile number (one to many)
	 	Hint : Do a join between these two tables and fetch the required rows. Follow the partial object fetching demo.
	 	
	 	Input : Take the data from database by inserting few records
	 	
	 	Expected Output: Display Mobile Number And Credit Card Details of each employee in the below format
	 	8390280006|Akash Maharana|1234 5678 9123 5678|ICICI|20-05-2021
	 	9861667562|Ray Thomson|9969 7867 9123 5678|HDFC|05-05-2030
	 	9438484142|Amanda Desouza|9758 7867 9123 5678|ICICI|05-10-2021
	 	8390280006|Akash Maharana|9969 5678 9123 5678|SBI|21-03-2023
	 	9438484142|Amanda Desouza|9758 1234 9123 5678|SBI|05-10-2024
	 	9438484142|Amanda Desouza|9758 7867 9123 5678|HSBC|23-10-2021
	*/
	
	public void displayMobileNumberAndCreditCardDetails() {
		//write your logic here to print the data set
		//to validate your logic insert few records into database and fetch it to test accordingly
	}
	
	/*
	 	Please follow the pattern to display the records accordingly.
	 	
	 	Cellular Number|Consumer Name|Number of Registered Credit Card
	 	
	 	Hint : Do a join between these two tables and fetch the required rows. Follow the partial object fetching demo.
	 	
	 	Input : Take the data from database by inserting few records
	 	
	 	Expected Output: Display Number Of Credit Card With Each Person Ascending Order Of Their Name in the below format
	 	8390280006|Akash Maharana|2
	 	9438484142|Amanda Desouza|3
	 	9861667562|Ray Thomson|1
	*/
	
	public void displayNumberOfCreditCardWithEachPersonAscendingOrderOfTheirName() {
		//write your logic here to print the data set
		//to validate your logic insert few records into database and fetch it to test accordingly
	}

}
