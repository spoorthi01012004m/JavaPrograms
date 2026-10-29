package com.oops.abstraction;

public class PlaceAnOrder {
	private String userName;
	private String product;
	private String address;
	private String payment;
	private String phoneNumber;

	public PlaceAnOrder(String userName, String product, String address, String payment, String phoneNumber) {
		super();
		this.userName = userName;
		this.product = product;
		this.address = address;
		this.payment = payment;
		this.phoneNumber = phoneNumber;
	}

	// To place an order and it is visible to other classes
	public void placeOrder() {
		validateOrder();
		verifyPayment();
		generateOrderId();
		trackOrder();

	}

	// Hiding core functions which verify and place order
	// Validates the user info
	private void validateOrder() {
		if (product == null || phoneNumber == null || address == null) {
			System.out.println("Provide the required information ....");
		} else {
			System.out.println("You order confirmed successfully !!");
		}
	}

	// Verify the payment status
	private void verifyPayment() {
		if (payment == "done") {
			System.out.println("Payment done successfully, Order placed");
		} else {
			System.out.println("Please do payment");
		}
	}

	// creates particular order ID
	private void generateOrderId() {
		System.out.println("Id generated");
	}

	// Tracking order
	private void trackOrder() {
		System.out.println("Tracking order.......");
	}

}
