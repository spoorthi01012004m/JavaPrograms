package com.oops.cloning.deep;

public class Driver {
	public static void main(String args[]) throws CloneNotSupportedException {
		Address address = new Address("BTM Layout, Bengaluru", "Karnataka", "India");
		Employee emp1 = new Employee("Jaggu", "FS123", "IT", address);
		Employee emp2 = (Employee) emp1.clone();
		
		System.out.println(emp1.getAddress() == emp2.getAddress());//false, deep cloning creates new copy of the nested object
	}

}
