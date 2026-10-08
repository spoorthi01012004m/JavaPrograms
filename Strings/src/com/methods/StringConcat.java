package com.methods;

/*
 * String concat method joints two strings , but at the same time it will create new object with new value
 */
public class StringConcat {

	public static void main(String[] args) {
		String firstName = "Tom and"; //objects created using literal
		String secondName = " Jerry"; //Object created using literal
		
		System.out.println(firstName.concat(secondName)); //concat creates new object with different address and refer the new object
		
	
	}

}
