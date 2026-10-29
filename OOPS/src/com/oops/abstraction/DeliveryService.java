package com.oops.abstraction;

public abstract class DeliveryService {

	abstract void calcDeliveryCharge(float distance);

	abstract void orderDelivery();

	public void trackOrder() {
		System.out.println("Your order is tracking......");
	}

}

class BikeDelivery extends DeliveryService {

	private final int DELIVERY_CHARGE_PER_KM = 5;

	@Override
	void calcDeliveryCharge(float distanceInKm) {
		System.out.println("Delivery charge applied is: " + distanceInKm * DELIVERY_CHARGE_PER_KM);

	}

	@Override
	void orderDelivery() {
		System.out.println("oder delivered by Bike");
	}

}

class CarDelivery extends DeliveryService {
	private final int DELIVERY_CHARGE_PER_KM = 10;

	@Override
	void calcDeliveryCharge(float distanceInKm) {
		System.out.println("Delivery charge applied is: " + distanceInKm * DELIVERY_CHARGE_PER_KM);

	}

	@Override
	void orderDelivery() {
		System.out.println("oder delivered by Car");
	}

}

class ExpressDelivery extends DeliveryService {
	private final int DELIVERY_CHARGE_PER_KM = 15;
	private final int FIXED_AMOUNT = 35;

	@Override
	void calcDeliveryCharge(float distanceInKm) {
		System.out.println("Delivery charge applied is: " + (distanceInKm * DELIVERY_CHARGE_PER_KM )+ FIXED_AMOUNT);
	}

	@Override
	void orderDelivery() {
		System.out.println("oder delivered by Express way");
	}
}
