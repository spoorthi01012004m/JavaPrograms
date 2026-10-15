package com.oops.basic.staticblock;

public class DriverInstance {

	public static void main(String[] args) {
		System.out.println("DriverInstance class loaded...");
		InstanceUser user = new InstanceUser();
		InstanceUser user1 = new InstanceUser();
		InstanceUser user2 = new InstanceUser();
		InstanceUser user3= new InstanceUser();
	}

}
