package com.basics;

public class StringPlus {

	public static void main(String[] args) {
		// When literals are concated using plus operator and where each literals are
		// not referred by any variable
		String s1 = "This " + "is from" + " Kodewala";
		String s2 = "This is from Kodewala";
		// This is called compile time optimization
		System.out.println(s1.equals(s2));

		String s3 = "Kodewala"; // SCP
		String s4 = "Academy"; // SCP
		String s5 = s3 + s4; // heap ---> new StringBuilder();
		String s6 = "KodewalaAcademy";
		System.out.println();

	}

}
