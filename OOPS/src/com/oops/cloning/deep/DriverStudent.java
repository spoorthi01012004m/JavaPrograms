package com.oops.cloning.deep;

public class DriverStudent {

	public static void main(String[] args) throws CloneNotSupportedException {
		StudentAddress address = new StudentAddress("#203", "16th cross,BTM Layout", "Bengaluru", "Karnataka");
		Student s1 = new Student("1SI22EC102", "Spoorthi", "B.E", address);
		Student s2 = (Student) s1.clone();
		s2.getAddress().setCity("Mysore");
        
		System.out.println("Original obj city name: "+s1.getAddress().getCity());
		System.out.println("Copied obj city name: "+s2.getAddress().getCity());
	}

}
