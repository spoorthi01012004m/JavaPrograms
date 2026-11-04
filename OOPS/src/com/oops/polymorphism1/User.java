package com.oops.polymorphism1;

public class User {

	public static void main(String[] args) {
		CustomerSubscriptionProcess customer1  =  new CustomerSubscriptionProcess();
		PlatinumSubscriptionCustomer pCustomer = new PlatinumSubscriptionCustomer("Jaggu", "6543789012","RS123");
		customer1.subscriptionHandle(pCustomer);

	}

}
