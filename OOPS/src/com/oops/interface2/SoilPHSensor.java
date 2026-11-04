package com.oops.interface2;

public class SoilPHSensor implements IFarmSensor{

	@Override
	public void getSensorReading() {
		System.out.println("SoilPHSensor.getSensorReading()");
		
	}

	@Override
	public void getSensorReading(String fieldId) {
		System.out.println("SoilPHSensor.getSensorReading()");
		
	}

	@Override
	public void getSensorReading(String startTime, String endTime, String fieldId) {
		System.out.println("SoilPHSensor.getSensorReading()");
		
	}

}
