package com.basics;

public class PlaceOfOrders {
	String customerFirstName = new String("");
	String customerLastName = new String("");
	String orderPlace;

	public PlaceOfOrders(String _customerFirstname, String _customerLastName, String _orderPlace) {
		this.customerFirstName = _customerFirstname.intern();
		this.customerLastName = _customerLastName.intern();
		this.orderPlace = _orderPlace;

	}

	public void printDetails() {

		System.out.println("Full Name: " + customerFirstName + " " + customerLastName + "\nPlace: "
				+ orderPlace);
		System.out.println(customerFirstName == customerLastName);
	}

}
