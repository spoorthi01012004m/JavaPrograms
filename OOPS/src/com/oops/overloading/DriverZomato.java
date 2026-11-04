package com.oops.overloading;

public class DriverZomato {

	public static void main(String[] args) {
		ZomatoLogin user1 = new ZomatoLogin();
		user1.doLogin("spoo123@gmail.com", "Dumbo123");
		user1.doLogin("google");
		user1.doLogin("9087123451", 56341);
		

	}

}
