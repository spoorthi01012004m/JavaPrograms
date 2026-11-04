package com.oops.interfaces.functional.OnlineShoppingDiscountSystem;

/*
 * Product class includes common product details 
 */
public class Product {
	private String productName;
	private double price;

	public Product(String productName, double price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
