package com.oops.overriding;

public class InternationalTaxCalc extends TaxCalculator {
	private final int INTERNATIONAL_TAX_IN_PERCENT = 10;

	@Override
	public void calculateTax(double amount) {
		double totalAmount = 0;
		double taxAmount = (amount * INTERNATIONAL_TAX_IN_PERCENT) / 100;
		totalAmount = taxAmount + amount;
		System.out
				.println("Tax Applied on Annual Income is: " + taxAmount + "\nTotal payable amount is: " + totalAmount);
	}

}
