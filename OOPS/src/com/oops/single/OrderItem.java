package com.oops.single;

public class OrderItem {
	private String productId;
	private String productName;
	private double price;
	private int quantity;

	public OrderItem(String productId, String productName, double price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;

	}

	public double price() {
		return price;
	}

	public int quantity() {
		return quantity;
	}

	public double totalPrice() {
		return (price * quantity);
	}

	public void setQuantity(int updatedQuantity) {
		if (updatedQuantity > 0) {
			this.quantity = updatedQuantity;
		} else
			System.out.println("Please Enter Quantity..");
	}

}
