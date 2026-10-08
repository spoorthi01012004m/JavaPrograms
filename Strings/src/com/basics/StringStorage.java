package com.basics;

public class StringStorage {

	public static void main(String[] args) {
		String s1 = "Ram";   // String object created using String literals
		String s2 = "Ram";
		String s3 = new String("Ram");// String object creation using new keyword
		String s4 = new String("Ram");

		System.out.println("s1 == s2 :" + (s1 == s2));   // True
		System.out.println("s1 == s2 :" + (s2 == s3));   // False
		System.out.println("s1 == s2 :" + (s3 == s4));   // False
		
		System.out.println("s1 == s2 :" + s1.equals(s2));// True
		System.out.println("s1 == s2 :" + s2.equals(s3));// True
		System.out.println("s1 == s2 :" + s3.equals(s4));// True

	}

}
