package com.oops.overloading;

/*
 * This class represents the concept of method overloading 
 */
public class EcommerceShippingCalculator {
	final private int GST_PER_PARCEL = 15;
	final private int AMOUNT_PER_KG = 20;
	final private float AMOUNT_PER_KM = 3.5f;
	final private int EXPRESS_AMOUNT = 35;
	private float totalAmount;

	// calculates shipping charges based on the package weight
	public float calculateShipping(float packageWeight) {
		totalAmount = (AMOUNT_PER_KG * packageWeight) + GST_PER_PARCEL;
		return totalAmount;
	}

	// calculates shipping charges based on weight and delivery distance
	public float calculateShipping(float packageWeight, float distanceInKiloMeter) {
		totalAmount = (AMOUNT_PER_KG * packageWeight) + GST_PER_PARCEL + (distanceInKiloMeter * AMOUNT_PER_KM);
		return totalAmount;
	}

	// calculates shipping charges based on weight, delivery distance and express
	// delivery option
	public float calculateShipping(float packageWeight, float distanceInKiloMeter, boolean isExpress) {
		totalAmount = (AMOUNT_PER_KG * packageWeight) + GST_PER_PARCEL + (distanceInKiloMeter * AMOUNT_PER_KM)
				+ EXPRESS_AMOUNT;
		return totalAmount;
	}

}
