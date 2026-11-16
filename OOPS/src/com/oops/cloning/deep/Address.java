package com.oops.cloning.deep;
/*
 * This class includes employee address model 
 */
public class Address implements Cloneable{
	private String adressLine1;
	private String state;
	private String country;

	public Address(String adressLine1, String state, String country) {
		super();
		this.adressLine1 = adressLine1;
		this.state = state;
		this.country = country;
	}

	public String getAdressLine1() {
		return adressLine1;
	}

	public void setAdressLine1(String adressLine1) {
		this.adressLine1 = adressLine1;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

}
