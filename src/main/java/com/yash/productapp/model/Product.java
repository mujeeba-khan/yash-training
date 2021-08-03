package com.yash.productapp.model;

public class Product {
	
	/**
	 * Creating Product class to display the properties of class product
	 * author Zainab
	 * 
	 */
	 
	int id; // id of the product
	String name; //name of the product
	double price; //price of the product
	String color; //color of the product
		
	public Product(int id, String name, double price, String color) 
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public Product() {
		System.out.println("Default constructor is invoked");
	}

	public void getDetails() 
	{
		System.out.println("Product id: "+id+"\nProduct name: "+
				name +"\nProduct price: "+price+ "\nProduct color: "+color);
	}
	
}
