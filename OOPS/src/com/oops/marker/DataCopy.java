package com.oops.marker;

public class DataCopy {
	public void dataCopy(Object obj) {
		if(obj instanceof CopyObj) {
			System.out.println("Data is being copied from the database");
		}
		else 
			System.out.println("Data not copied");
	}

}
