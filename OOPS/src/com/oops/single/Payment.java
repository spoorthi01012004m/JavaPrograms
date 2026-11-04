package com.oops.single;

public class Payment {
	private String paymentID;
	private String paymentDate;
	protected String paymentStatus;
	private String orderId;
	private double amountToPay;

	public Payment(String paymentID, String paymentDate, String orderId, double amountToPay) {
		super();
		this.paymentID = paymentID;
		this.paymentDate = paymentDate;
		this.orderId = orderId;
		this.amountToPay = amountToPay;
	}

	public void doPayment(String orderId, double totalAmount) {
		System.out.println("Online Payment");
	}

	public void getPaymentDetails() {
		System.out.println("Order Id: " + orderId + "\nTotal Amount: " + amountToPay + "\nPayment Status: "
				+ paymentStatus + "\nPayment Id: " + paymentID + "\nDate of payment: " + paymentDate);

	}

	public String getOrderId() {
		return orderId;
	}

	public double getTotalAmount() {
		return amountToPay;
	}

	public void updatePaymentStatus() {
		paymentStatus = "Initiate";
	}

}

class UPIPayment extends Payment {
	private final double GST = 2.5;

	public UPIPayment(String paymentID, String paymentDate, String orderId, double amountToPay) {
		super(paymentID, paymentDate, orderId, amountToPay);
	}

	@Override
	public void updatePaymentStatus() {
		paymentStatus = "Paid";
	}

	@Override
	public void doPayment(String orderId, double totalAmount) {
		System.out.println("Amount paid: " + (GST + totalAmount));
		System.out.println("Payment done successfully through UPI");
	}

}

class CreditCardPayment extends Payment {
	private final double GST = 3;

	public CreditCardPayment(String paymentID, String paymentDate, String orderId, double amountToPay) {
		super(paymentID, paymentDate, orderId, amountToPay);
	}

	@Override
	public void updatePaymentStatus() {
		paymentStatus = "Paid";
	}

	@Override
	public void doPayment(String orderId, double totalAmount) {
		System.out.println("Amount paid: " + (GST + totalAmount));
		System.out.println("Payment done successfully through Credit Card");
	}

}

class DebitCardPayment extends Payment {
	private final double GST = 4;

	public DebitCardPayment(String paymentID, String paymentDate, String orderId, double amountToPay) {
		super(paymentID, paymentDate, orderId, amountToPay);
	}

	@Override
	public void updatePaymentStatus() {
		paymentStatus = "Paid";
	}

	@Override
	public void doPayment(String orderId, double totalAmount) {
		System.out.println("Amount paid: " + (GST + totalAmount));
		System.out.println("Payment done successfully through Debit Card");
	}

}
