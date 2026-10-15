package com.basics;

public class CityNames {

	public static void main(String[] args) {
		String city1 = "Bengaluru";
		String city2 = "Mysore";
		String city3 = new String("Bengaluru");
		String city4 = new String("Bengaluru");
		
		System.out.println(city1 == city3); //false
		System.out.println(city3 == city4); //false
		System.out.println(city1.equals(city3));//true
		System.out.println(city3.equals(city4));//true

	}

}
