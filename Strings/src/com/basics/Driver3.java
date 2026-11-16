package com.basics;

public class Driver3 {

	public static void main(String[] args) {
		String name = "Jayanthi";//stored in SCP 1-obj
		String fullName = name.concat(" Raj");//"Raj stored in SCP , result stored in heap --> 2obj
		String existingName = "Jayanthi Raj"; //Name "Jayanthi Raj" stored in SCP
		String womanName = fullName.intern(); // first it checks is there any obj in SCP with same content if it is it start referring the same obj otherwise ,
		                                      //creates copy of fullName inside SCP but not reference still point to heap
		
		System.out.println(fullName==womanName); //false
		

	}

}
