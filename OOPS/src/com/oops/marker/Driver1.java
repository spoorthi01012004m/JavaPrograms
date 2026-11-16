package com.oops.marker;

public class Driver1 {

	public static void main(String[] args) {
		User user1 = new User("Spoorthi", "SP001");
		System.out.println("User name: "+ user1.getUserName());
		DataCleaner cleaner = new DataCleaner();
		cleaner.cleanData(user1);
		

	}

}
