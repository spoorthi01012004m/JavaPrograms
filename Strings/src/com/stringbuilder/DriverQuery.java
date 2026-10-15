package com.stringbuilder;

public class DriverQuery {

	public static void main(String[] args) {
		GenerateQuery query1 = new GenerateQuery();
		StringBuilder emp1 = query1.generateQuery(20000, "EMP123");
		System.out.println(emp1);
		
	}

}
