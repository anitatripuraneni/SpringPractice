package com.spring.practice;

import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Address {
	
	
	private String street;
	private String postalCode;
	private String city;
	private String county;
	
	
	public Address(){
		
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}
	public void onCreate(){
		System.out.println("Address created: "+this);
	}

	public void onDestroy(){
		System.out.println("Address destoryed");
	}
	public Address(String street,String postalCode){
		this.street = street;
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", postalCode=" + postalCode + ", city=" + city + ", county=" + county
				+ "]";
	}

	

}
