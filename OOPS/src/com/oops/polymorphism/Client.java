package com.oops.polymorphism;

import java.util.*;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Please choose the payment type...\n Press 1 - Credit card\n Press 2 - Debit card\n Press 3 - Net Banking ");
		int numberButton = sc.nextInt();
		ProcessPayment processPayment = new ProcessPayment();
		switch (numberButton) {
		case 1:
			CreditCardPayment creditPayment = new CreditCardPayment();
			System.out.println("processing Payment.....");
			processPayment.processPayment(creditPayment);
			break;
		case 2:
			DebitCardPayment deCardPayment = new DebitCardPayment();
			System.out.println("processing Payment.....");
			processPayment.processPayment(deCardPayment);
			break;
		case 3:
			NetBanking netBanking = new NetBanking();
			System.out.println("processing Payment.....");
			processPayment.processPayment(netBanking);
		default:
			System.err.println("Please choose payment method");
		}
		
	}

}
