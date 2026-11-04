package com.oops.polymorphism1;

public class GoldSubscriptionCustomer extends Customer {

	public GoldSubscriptionCustomer(String customerName, String phoneNumber, String customerId) {
		super(customerName, phoneNumber, customerId);
	}

	@Override
	public void doOrder() {
		System.out.println("GoldSubscriptionCustomer.doOrder().........");
	}

}
