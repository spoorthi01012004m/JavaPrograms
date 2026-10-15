package com.oops.basic.staticblock;

class ApplicationRecord {
	public ApplicationRecord() {
		System.out.println("You are inside the ApplicationRecord()......");
	}
}

public class InstanceUser extends ApplicationRecord {
	// Instance initialization block
	{
		System.out.println("Entered IIB");
	}

	public InstanceUser() {
		super(); // 1st line for super or this key word
		// 2nd line for IIB , IIB executes whenever the object is created means -every
		// object
		System.out.println("You are inside the InstanceUser()....");
	}

}
