package com.stringbuilder;

public class GenerateQuery {
	StringBuilder sb = new StringBuilder("Select * From emp ");

	public StringBuilder generateQuery(int salary, String empId) {
		if (salary > 0) {
			sb.append("where salary =" + salary + " ;");
		} else if (empId != null) {
			sb.append("where empId = " + empId + " ;");
		} else
			sb.append(";");
		return sb;

	}

}
