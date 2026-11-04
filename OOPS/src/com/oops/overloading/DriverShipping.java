package com.oops.overloading;

public class DriverShipping {

	public static void main(String[] args) {
		EcommerceShippingCalculator parcel1 = new EcommerceShippingCalculator();
		double amount  = parcel1.calculateShipping(4.5f);
		System.out.println("Total shipping charges: "+amount);
		amount  = parcel1.calculateShipping(4.5f, 2);
		System.out.println("Total shipping charges: "+amount);

	}

}
