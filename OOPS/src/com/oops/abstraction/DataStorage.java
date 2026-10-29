package com.oops.abstraction;

public class DataStorage {
	public void saveData() {
		isDataValid();
		isDiskSpaceAvailable();
		validNetwork();
		System.out.println("DataStorage.saveData()");
		
	}
	private void isDataValid() {
		System.out.println("DataStorage.isDataValid()");
	}
	private void isDiskSpaceAvailable() {
		System.out.println("DataStorage.isDiskSpaceAvailable()");
	}
	private void validNetwork() {
		System.out.println("DataStorage.validNetwork()");
	}
	

}
