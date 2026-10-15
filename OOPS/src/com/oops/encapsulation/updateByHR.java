package com.oops.encapsulation;

public class updateByHR {

	public static void main(String[] args) {
		Employee emp1 = new Employee("IND102","Rithu" , "Product Development", 1000000l);
		emp1.updateDept("Engineering");
		emp1.revisedSalary(1500000l);
		System.out.println(emp1.getSalary());

	}

}
