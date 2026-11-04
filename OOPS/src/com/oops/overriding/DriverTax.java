package com.oops.overriding;

public class DriverTax {

	public static void main(String[] args) {
		// creating object
		DomesticTaxCalc user1 = new DomesticTaxCalc();
		user1.calculateTax(120000);

		InternationalTaxCalc user2 = new InternationalTaxCalc();
		user2.calculateTax(120000);

		SmallBuisnessTaxCalc user3 = new SmallBuisnessTaxCalc();
		user3.calculateTax(120000);

	}

}
