package com.oops.polymorphism1;

class Delivery{
	public void doDelivery() {
		System.out.println("Delivery.doDelivery()..");
	}
}

class ExpressBee extends Delivery{
	@Override
	public void doDelivery() {
		System.out.println("ExpressBee.doDelivery()");
	}
}

class EKart extends Delivery{
	@Override
	public void doDelivery() {
		System.out.println("EKart.doDelivery()");
	}
	
}

public class Driver {

	public static void main(String[] args) {
		Delivery delivery  = new Delivery();
		delivery.doDelivery();
		
		//up casting 
		//At compile time - it will check parent class for existence of that method
		//At runtime - it will check class of object for the existence of that method
		Delivery delivery2 = new ExpressBee();
		delivery2.doDelivery();
		
		//down casting 
		//Child class can be used as reference only to up casted same object
		Delivery delivery3  = new EKart();
		EKart eKart = (EKart) delivery3;
		eKart.doDelivery();
		

	}

}
