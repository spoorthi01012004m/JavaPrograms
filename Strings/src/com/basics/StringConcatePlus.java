package com.basics;

public class StringConcatePlus {

	public static void main(String[] args) {
		String fullName = args[0]+ " "+ args[1]; //1 obj SCP
		String emailAddress = args[2];       //1 obj SCP
		System.out.println("Student Full Name: "+ fullName+"\nEmail Address: "+emailAddress);

	}

}
