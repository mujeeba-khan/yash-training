package com.yash.exceptionhandling.labassignmentspart1;

public class Product {
	
	/**
	 * Creating Product class to display the properties of class product
	 * author Zainab
	 * 
	 */
	 
	int id; // id of the product
	String name; //name of the product
	double price; //price of the product
	
	public Product(int id, String name, double price) 
	{

		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		System.out.println("Default constructor is invoked");
	}

	void getDetails() //getter method
	{
		System.out.println("Product details are: \nProduct id: "+id+"\nProduct name: "+name +"\nProduct price: "+price);
	}
	
	
	

}
