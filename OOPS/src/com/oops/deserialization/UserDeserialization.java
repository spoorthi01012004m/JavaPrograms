package com.oops.deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.oops.serialization.User;

public class UserDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("D:\\Java Programming Language\\JavaWorkSpace\\OOPS\\user.txt");
		ObjectInputStream oos = new ObjectInputStream(fis);
		User user1 = (User) oos.readObject();
		
		// without transient
		System.out.println("User Name: " + user1.getUserName());
		
		// trying print transient attribute - provides default value of data type
		System.out.println("User password: " + user1.getPassword());
		oos.close();

	}

}
