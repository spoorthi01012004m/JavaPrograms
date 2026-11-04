package com.oops.overloading;

public class DriverRegister{
	public static void main(String args[]){
		Registration user1 = new Registration();
		user1.doRegistration("8900-9876-5678");
		user1.doRegistration("9876345609", 9087);
	}
}
