package com.methods;

public class StringMethods {
	public static void main(String args[]) {
		String name = args[0];
		String name2 = args[1];
		String str = "spoorthi";
		System.out.println("Length of the name : "+name.length());
		
		System.out.println("Letter based on index: " + name.charAt(2));
		System.out.println(name.equalsIgnoreCase(name2));
		
		System.out.println(str.indexOf("p"));
		System.out.println(str.lastIndexOf("o"));
		System.out.println(str.substring(3));
		System.out.println(str.substring(2,4));
		
	}

}
