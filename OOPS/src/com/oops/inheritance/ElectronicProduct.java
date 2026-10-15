package com.oops.inheritance;

public class ElectronicProduct extends Product {
	boolean isWarranty;
	int warrantyInYears;

	public ElectronicProduct(String prodName, String description, int quantity, String status, boolean isWarranty,
			int warrantyInYears) {
		super(prodName, description, quantity, status);
		this.isWarranty = isWarranty;
		this.warrantyInYears = warrantyInYears;
	}

	public void printElectronicDetails() {
		printProductDetails();
		System.out.println("Warranty available: " + isWarranty);
		System.out.println("Warranty in years : " + warrantyInYears);
	}

}
