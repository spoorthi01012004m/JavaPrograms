package com.oops.inheritance;

class AmazonFashionProduct{
	String prodName;
	int quantity;
	String size;
	String color;
	
	public AmazonFashionProduct(String prodName, int quantity, String size, String color) {
		super();
		this.prodName = prodName;
		this.quantity = quantity;
		this.size = size;
		this.color = color;
	}

	public void productDetails() {
	System.out.println(prodName);
	System.out.println(quantity);
	System.out.println(size);
	System.out.println(color);
	}
}
class Kids extends AmazonFashionProduct{
	String clothType;
	
	public Kids(String prodName, int quantity, String size, String color, String clothType) {
		super(prodName, quantity, size, color);
		this.clothType = clothType;
	}

}

class Womens extends AmazonFashionProduct{

	public Womens(String prodName, int quantity, String size, String color) {
		super(prodName, quantity, size, color);
	} 
	
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Kids prod1 = new Kids("shorts", 2, "xc","blue","Pure Cotton");
		prod1.productDetails();
		Womens prod2 = new Womens("Anarkali", 3, "M", "Lavender");
        prod2.productDetails();
	}

}
