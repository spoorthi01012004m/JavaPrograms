package com.oops.serialization;

import java.io.IOException;

public class DriverUser {

	public static void main(String[] args) throws IOException {
		User user = new User("RSP2", "Krish","krish23@gmail.com" , "KrIsH@#01", "12345678");
		
		UserSerialization serialization = new UserSerialization();
		serialization.serialize(user);
	}

}
