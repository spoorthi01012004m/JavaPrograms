package com.oops.overloading;

class Registration{
	
	// method - 1 : registering using aadhar
	public void doRegistration(String aadhar){
		System.out.println("Method 1: doRegistration(String aadhar)");
	}
	
	// method - 2: registering using phone number
	public void doRegistration(String phoneNumber, int otp){
		System.out.println("Method - 2: doRegistration(String phoneNumber, int otp)");
	}
	
	//method - 3: registering using name and email
	public void doRegistration(String name, String email){
	System.out.println("Method - 3: String phoneNumber, int otp)");
	}
	
}


	
		
		