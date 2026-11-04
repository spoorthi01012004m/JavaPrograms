package com.oops.interface2;

public class SoilMoistureSensor implements IFarmSensor{
   private final double THRESHOLD_IN_PERCENTAGE = 20; 
   public double moistureValue;
   
	public SoilMoistureSensor(double moistureValue) {
	super();
	this.moistureValue = moistureValue;
}

	@Override
	public void getSensorReading() {
		System.out.println("Soil Moisture Sensor");
		System.out.println("Sensor moisture value: "+2.4);		
	}

	@Override
	public void getSensorReading(String fieldId) {
		System.out.println("Soil Moisture Sensor");
		System.out.println("Moisture value in the given field "+fieldId+" is:"+ moistureValue);
		if(moistureValue < THRESHOLD_IN_PERCENTAGE) {
			System.out.println("Result: Soil is DRY");
		}
		else if(moistureValue > THRESHOLD_IN_PERCENTAGE && moistureValue < 40) {
			System.out.println("Result: Soil Moist is MODERATE");
		}
		else 
			System.out.println("Result: Soil is WET");
		
	}

	@Override
	public void getSensorReading(String startTime, String endTime, String fieldId) {
		System.out.println("SoilMoistureSensor.getSensorReading()......");
		
	}

}
