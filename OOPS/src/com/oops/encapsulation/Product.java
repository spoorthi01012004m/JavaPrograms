package com.oops.encapsulation;

public class Product {
	private String prodId;
	private String prodName;
	private int price;
	private int stock;

	public Product(String prodId, String prodName, int price, int stock) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.stock = stock;
	}

	public void updatePrice(int amountToUpdate) { // method to update price
		if (amountToUpdate > 0) {
			this.price += amountToUpdate;
		}
	}

	public void purchase(int qnt) {// method to update stock
		if (qnt <= stock) {
			this.stock -= qnt;
		} else
			System.err.println("Product is out of stock");
	}

	public void restock(int qnt) { //method to restock the stock
		if (qnt > 0) {
			this.stock += qnt;
		} else
			System.out.println("Enter proper quantity");
	}

	public int getStock() { //method to get stock value
		return stock;
	}

}
