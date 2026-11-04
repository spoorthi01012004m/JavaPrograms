package com.oops.overriding;

public class Payment {
	private String userName;
	private String phoneNumber;

	public Payment(String userName, String phoneNumber) {
		super();
		this.userName = userName;
		this.phoneNumber = phoneNumber;
	}

	public void processPayment(double amount) {
		System.out.println("processing payment , amount: " + amount);
	}
}

class UPIPayment extends Payment{

	public UPIPayment(String userName, String phoneNumber) {
		super(userName, phoneNumber);
	}
	
	@Override
	public void processPayment(double amount) {
		System.out.println("Payment done through UPI");
	}
}
class CreditCardPayment extends Payment{

	public CreditCardPayment(String userName, String phoneNumber) {
		super(userName, phoneNumber);
	}
	@Override
	public void processPayment(double amount) {
		System.out.println("Payment done through credit card");
	}
	
}
class WalletPayment extends Payment{

	public WalletPayment(String userName, String phoneNumber) {
		super(userName, phoneNumber);
	}
	
	@Override
	public void processPayment(double amount){
		System.out.println("Wallet payment");
	}
	
}