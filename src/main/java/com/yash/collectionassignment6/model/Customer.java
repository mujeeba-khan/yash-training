package com.yash.collectionassignment6.model;

public class Customer 
{
	String name;
	String contact;
	String city;
	
	
	public Customer() {
		super();
	}

	

	public String getName() {
		return name;
	}



	public String getContact() {
		return contact;
	}



	public String getCity() {
		return city;
	}



	public Customer(String name, String contact, String city) {
		super();
		this.name = name;
		this.contact = contact;
		this.city = city;
	}



	@Override
	public String toString() {
		return "Customer [name=" + name + ", contact=" + contact + ", city=" + city + "]";
	}
	
	
	
}
