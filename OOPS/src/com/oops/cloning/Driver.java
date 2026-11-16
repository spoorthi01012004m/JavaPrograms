package com.oops.cloning;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Adress adress1 = new Adress("1st stage BTM Layout", "Bengaluru");
		Employee emp1 = new Employee("Spoorthi", "IT102", adress1);
		
		Employee emp2 = (Employee) emp1.clone();
		
		adress1.setLine1("2nd stage");
		System.out.println(emp1.getAdress().getLine1());
		System.out.println(emp2.getAdress().getLine1());
        System.out.println(emp1.getAdress() == emp2.getAdress());
	}

}
