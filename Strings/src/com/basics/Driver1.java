package com.basics;

public class Driver1 {

	/*
	 * "Sathi" is a literal stored in SCP -1 obj
	 * "Shiva is a literal stored in SCP -1 obj
	 * name.equals("Shiva") --> result will be stored in heap only
	 * variable s is reference that point to the heap object 
	 */
	public static void main(String[] args) {
		String name  = "Sathi";
		String s = name.concat("Shiva");
		System.out.println(name.equals(s));

	}

}
