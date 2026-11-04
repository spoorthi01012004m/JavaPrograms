package com.oops.interfaces.functional.OnlineShoppingDiscountSystem;

public class ShoppingService {
	double discountPercentage ;

	public void discountProcess(Product product, IDiscountCalculator discountCalculator, Customer customer) {
		
		switch(customer.getCustomerType()) {
		case "PREMIUM":
			discountPercentage = 25;
			break;
		case "REGULAR":
			discountPercentage = 10;
			break;
		case "FSTIVALOFFER":
			discountPercentage = 40;
			break;
		default :
			discountPercentage = 0;
			System.out.println("Please enter customer type");
		}
		
		double finalPrice = discountCalculator.calcDiscount(product.getPrice(), discountPercentage) ;
		System.out.println("Customer: "+customer.getCustomerName());
		System.out.println("Customer Type: "+customer.getCustomerType());
		System.out.println("Product: "+product.getProductName());
		System.out.println("Original Price: "+product.getPrice());
		System.out.println("Disocunt in percentage: "+ discountPercentage);
		System.out.println("Total Price: "+finalPrice);
		
	}
}
