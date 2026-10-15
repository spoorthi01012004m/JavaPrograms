package com.oops.inheritance;

public class ProductDriver {

	public static void main(String[] args) {
		ClothingProduct item1 = new ClothingProduct("Saree", "Mysore silk KSIC saree", 6, "Available", "Meron",
				"Pure silk");
		item1.printClothDetails();
		System.out.println();
		ElectronicProduct item2 = new ElectronicProduct("Kettel", "Kettel should be used only to boil water", 3,
				"available", true, 1);
		item2.printElectronicDetails();

	}

}
