package com.oops.marker;

public class DataDriver {

	public static void main(String[] args) {
		User1 user1 = new User1("Dharm", 23);

		DataCopy copy = new DataCopy();
		copy.dataCopy(user1);
		System.out.println("Name: " + user1.getName());
		System.out.println("Age: " + user1.getAge());

	}

}
