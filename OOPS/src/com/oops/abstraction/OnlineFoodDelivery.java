package com.oops.abstraction;

public class OnlineFoodDelivery {

	public static void main(String[] args) {
	    BikeDelivery order1 = new BikeDelivery();
	    order1.calcDeliveryCharge(2);
	    
	    CarDelivery order2 = new CarDelivery();
	    order2.calcDeliveryCharge(2);
	    
	    ExpressDelivery order3 = new ExpressDelivery();
	    order3.calcDeliveryCharge(2);
	}

}
