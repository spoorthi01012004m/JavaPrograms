package com.oops.interfaceConcept;

public class TrackingService {

	public void orderTracking(ITrackable order) {
		order.trackingOrder();
	}

}

class BikeDelivery implements ITrackable{

	@Override
	public void trackingOrder() {
		System.out.println("BikeDelivery.trackingOrder()........");
		
	}
	
}
class DroneDelivery implements ITrackable{

	@Override
	public void trackingOrder() {
		System.out.println("DroneDelivery.trackingOrder().........");
		
	}
	
}
class TruckDelivery implements ITrackable{

	@Override
	public void trackingOrder() {
		System.out.println("TruckDelivery.trackingOrder()...........");
		
	}
	
	
}