package com.oops.polymorphism1;

public class SilverSubscriptionCustomer extends Customer {

	public SilverSubscriptionCustomer(String customerName, String phoneNumber, String customerId) {
		super(customerName, phoneNumber, customerId);
	}

	@Override
	public void doOrder() {
		System.out.println("SilverSubscriptionCustomer.doOrder()...........");
	}

}
