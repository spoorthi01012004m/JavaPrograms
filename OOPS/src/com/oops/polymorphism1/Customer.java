package com.oops.polymorphism1;

//customer class includes all the common features of the customers 
public class Customer {
	private String customerName;
	private String phoneNumber;
	private String customerId;

	public Customer(String customerName, String phoneNumber, String customerId) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.customerId = customerId;
	}

	public void doOrder() {
		System.out.println("Customer.doOrder()...........");
	}

}
