package com.oops.solid;

public class Bike extends Vehicle{
       final double RENT_PER_DAY = 300;
       
       
       public Bike(String vehicleName, String vehicleNumber) {
		super(vehicleName, vehicleNumber);
	}


	@Override 
       public void isVehicleRegistered() {
    	   System.out.println("Bike is registered");
       }
	@Override
	public void rentPerDay(int numberOfDays) {
		System.out.println("Total rent is: "+numberOfDays * RENT_PER_DAY);
	}
	
	@Override
	public void showDetailsOfVehicle() {
		System.out.println("Vehicle Name: " + vehicleName);
		System.out.println("Vehicle Number: " + vehicleNumber);
		System.out.println("It is a petrol vehicle , milage - 45KM/Ltr");
	}

}
