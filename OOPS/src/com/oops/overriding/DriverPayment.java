package com.oops.overriding;

import java.util.Scanner;

public class DriverPayment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Please choose payment option: \nPress 1 - UPI Payment\nPress 2 - CreditCard Payment\nPress 3 - Wallet Payment");
		int button = sc.nextInt();
		switch(button) {
		case 1: 
			UPIPayment customer1 = new UPIPayment("Spoorthi", "9045678909");
			customer1.processPayment(12300);
			break;
		case 2:
			CreditCardPayment customer2 = new CreditCardPayment("Spoorthi","9045678909");
			customer2.processPayment(12300);
			break;
		case 3:
			WalletPayment customer3 = new WalletPayment("Spoorthi", "9045678909");
			customer3.processPayment(12300);
			break;
		default :
			System.out.println("Please choose any payment method");
		}

	}

}
