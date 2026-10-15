package com.oops.inheritance;
/*
 * This product class includes common function among all the product
 */
public class Product {

	String prodName;
	String description;
	int quantity;
	String status;

	public Product(String prodName, String description, int quantity, String status) {
		super();
		this.prodName = prodName;
		this.description = description;
		this.quantity = quantity;
		this.status = status;
	}

	public void printProductDetails() {
		System.out.println("Product Name: " + prodName + "\nDescription: " + description + "\nQuantity: " + quantity
				+ "\nStatus: " + status);
	}

}
