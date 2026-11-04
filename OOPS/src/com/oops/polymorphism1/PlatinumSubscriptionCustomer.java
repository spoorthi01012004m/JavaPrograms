package com.oops.polymorphism1;

public class PlatinumSubscriptionCustomer extends Customer {

	public PlatinumSubscriptionCustomer(String customerName, String phoneNumber, String customerId) {
		super(customerName, phoneNumber, customerId);
	}
	 
	@Override
	public void doOrder() {
		System.out.println("PlatinumSubscriptionCustomer.doOrder()................");
	}
	

}
