package com.oops.encapsulation;

public class ProductUser {

	public static void main(String[] args) {
		Product p = new Product("EC010", "KeyBoard", 15000, 15);
		
		p.purchase(4);
		System.out.println(p.getStock());
		
		//p.purchase(20);
		p.restock(20);
		System.out.println(p.getStock());

	}

}
