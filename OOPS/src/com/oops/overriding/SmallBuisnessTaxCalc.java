package com.oops.overriding;

public class SmallBuisnessTaxCalc extends TaxCalculator {
	private final int SMALLBUISNESS_TAX_IN_PERCENT = 5;

	@Override
	public void calculateTax(double amount) {
		double totalAmount = 0;
		double taxAmount = (amount * SMALLBUISNESS_TAX_IN_PERCENT )/ 100;
		totalAmount = taxAmount + amount;
		System.out
				.println("Tax Applied on Annual Income is: " + taxAmount + "\nTotal payable amount is: " + totalAmount);
	}

}
