package com.basics;

public class StringUsingNew {

	public static void main(String[] args) {
		// String object creation using new key word
		String person1 = new String("Guru");
		String person2 = new String("Sathya");
		String person3 = new String("Guru");
		// This equals method belongs to String class
		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));

	}

}
