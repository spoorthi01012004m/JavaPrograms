package com.methods;

public class StringToArray {

	public static void main(String[] args) {
		String fruits = " Mango, Apple, Orange, Lemon, Pomogranate";

		System.out.println("Normal string: " + fruits);
		String arr[] = fruits.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}

}
