package com.oops.interfaces.functional.OnlineShoppingDiscountSystem;

/*
 * This is a functional interface which helps to implement lambda expression
 */
@FunctionalInterface
public interface IDiscountCalculator {

	double calcDiscount(double price, double discountPercentage);

}
