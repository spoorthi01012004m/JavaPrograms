package com.basics;

public class StringLiterals {

	public static void main(String[] args) {
		//creating string object using string literals
		String firstName = "Reema";
		String secondName = "Ravi";
		String thirdName = "Reema";
        //this '==' checks the address of the objects than contents
		System.out.println(firstName == secondName); //return false
		System.out.println(firstName == thirdName); //return true

	}

}
