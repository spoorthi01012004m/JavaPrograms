package com.oops.interfaces.functional.OnlineShoppingDiscountSystem;

public class Driver {

	public static void main(String[] args) {
		Product product1 = new Product("Laptop", 20000);
		Product product2 = new Product("Samsung S23", 60000);
		Customer customer1 = new Customer("CS123", "Sid", "PREMIUM");
		//to calculate discount amount for premium customer
		IDiscountCalculator discountCalculator  = (productPrice , discountPercentage) -> {
			return (productPrice - (productPrice*discountPercentage/100));
		}; 
		
		ShoppingService service = new ShoppingService();
		
		service.discountProcess(product1, discountCalculator, customer1);

	}

}
