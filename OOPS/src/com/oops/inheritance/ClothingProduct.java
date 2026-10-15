package com.oops.inheritance;

public class ClothingProduct extends Product {
	String color;
	String clothType;

	public ClothingProduct(String prodName, String description, int quantity, String status, String color,
			String clothType) {
		super(prodName, description, quantity, status);
		this.clothType = clothType;
		this.color = color;

	}

	public void printClothDetails() {
		printProductDetails();
		System.out.println("Cloth color: " + color + "\nCloth type: " + clothType);
	}

}
