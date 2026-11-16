package com.oops.cloning.deep;

public class Employee implements Cloneable {
	private String name;
	private String empID;
	private String department;

	private Address address;

	public Employee(String name, String empID, String department, Address address) {
		super();
		this.name = name;
		this.empID = empID;
		this.department = department;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee emp = (Employee) super.clone();
		emp.address = (Address)address.clone();
		return emp;

	}

}
