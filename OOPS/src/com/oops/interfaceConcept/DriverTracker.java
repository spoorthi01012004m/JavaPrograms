package com.oops.interfaceConcept;

public class DriverTracker {

	public static void main(String[] args) {
		TrackingService order1 = new TrackingService();
		order1.orderTracking(new BikeDelivery());

	}

}
