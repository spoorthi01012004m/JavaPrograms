package com.oops.cloning;

public class Employee implements Cloneable{
	private String empName;
	private String empId;
	private Adress adress;

	public Employee(String empName, String empId, Adress adress) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.adress = adress;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();	}

}
