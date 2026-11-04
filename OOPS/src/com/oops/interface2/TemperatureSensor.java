package com.oops.interface2;

public class TemperatureSensor implements IFarmSensor {
	@Override
	public void getSensorReading() {
		System.out.println("TemperatureSensor.getSensorReading()");

	}

	@Override
	public void getSensorReading(String fieldId) {
		System.out.println("TemperatureSensor.getSensorReading()");

	}

	@Override
	public void getSensorReading(String startTime, String endTime, String fieldId) {
		System.out.println("TemperatureSensor.getSensorReading()");

	}

}
