package com.oops.marker;

public class DataCleaner {
	public void cleanData(Object obj) { // up casting
		if (obj instanceof Cleaner) { // instanceof checks wheather that class obj is implements this cleaner or not
			System.out.println("Permitted to do data cleaning .....");
		} else
			System.err.println("Not allowed to do data cleaning......");
	}

}
