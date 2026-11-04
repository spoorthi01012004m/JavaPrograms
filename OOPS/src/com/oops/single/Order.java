package com.oops.single;

import java.util.ArrayList;

public class Order {
	private String orderId;
	private ArrayList<OrderItem> orderItems;
	private String orderStatus = "Pending";
	private String createdTime;

	public Order(String orderId, String createdTime) {
		super();
		this.orderId = orderId;
		this.createdTime = createdTime;
	}

	public void addItem(OrderItem item) {
		orderItems.add(item);
	}
	public String getOrderId() {
		return orderId;
	}

	private double calculateTotalAmount() {
		double totalAmount = 0;
		for (OrderItem item : orderItems) {
			if (item.totalPrice() > 0) {
				totalAmount = totalAmount + item.totalPrice();
			}
		}
		orderStatus = "Pending Payment";
		return totalAmount;

	}

	public void orderDetails() {
		for (OrderItem item : orderItems) {
			System.out.println(item);
		}
		System.out.println("Total: " + calculateTotalAmount());
		System.out.println("Status : "+ orderStatus);
	}
	
}
