package com.oops.overriding;

public class DomesticTaxCalc extends TaxCalculator {
	private final int DOMESTIC_TAX_IN_PERCENT = 18;

	@Override
	public void calculateTax(double amount) {
		double totalAmount = 0;
		double taxAmount = (amount )* DOMESTIC_TAX_IN_PERCENT/ 100;
		totalAmount = amount + taxAmount;
		System.out
				.println("Tax Applied on Annual Income is: " + taxAmount + "\nTotal payable amount is: " + totalAmount);
	}
}
