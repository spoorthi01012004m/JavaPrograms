package com.oops.encapsulation;

public class Employee {
	private final String empId;
	private String empName;
	private String department;
	private Long salary;

	public Employee(String empId, String empName, String department, Long salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}

	public void updateName(String _newName) {// method to set or update the name
		if (_newName != null && _newName != "") {
			this.empName = _newName;

		} else
			System.out.println("Error: Enter name properly");
	}

	public void updateDept(String _newDept) {// method to set or update the department
		if (_newDept != null && _newDept != "") {

			this.department = _newDept;
		} else
			System.out.println("Error: Enter department properly");
	}

	public Long getSalary() { // method to get current salary
		return this.salary;
	}

	public void revisedSalary(Long increasedAmt) { // method to add revised salary to existing one
		salary += increasedAmt;
	}

}
