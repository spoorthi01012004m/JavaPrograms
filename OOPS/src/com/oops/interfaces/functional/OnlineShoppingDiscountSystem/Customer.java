package com.oops.interfaces.functional.OnlineShoppingDiscountSystem;

public class Customer {
	private String customerId;
	private String customerName;
	private String customerType;

	public Customer(String customerId, String customerName, String customerType) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerType = customerType;
	}

	public String getCustomerType() {
		return customerType;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	

}
