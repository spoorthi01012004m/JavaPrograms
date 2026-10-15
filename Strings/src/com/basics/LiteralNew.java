package com.basics;

public class LiteralNew {

	public static void main(String[] args) {

		String s1 = "Dora"; // 1 - SCP
		// using new keyword to create string objects
		
		String s2 = new String("Dora"); // 1 - obj SCP , 1 obj - heap
		
		System.out.println(s1 == s2); // False , total obj - 2

		String s3 = new String("Dora");
		
		System.out.println(s2 == s3);
		
		// comparing contents of the objects
		
		System.out.println(s2.equals(s3));

	}

}
