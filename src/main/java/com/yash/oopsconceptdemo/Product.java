package com.yash.oopsconceptdemo;

public class Product {
	
	/**
	 * Creating Product class to display the properties of class product
	 * author Zainab
	 * 
	 */
	 
	int id; // id of the product
	String name; //name of the product
	double price; //price of the product
	String color;
	
	public Product(int id, String name, double price, String color) { 

		this.id = id;
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public Product(int id, String name, double price) // constructor overloading
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
		System.out.println("Product details are: \nProduct id: "+id+"\nProduct name: "+name +"\nProduct price: "+price+"\n Product color: "+color);
	}
	
	void show()
	{
		System.out.println("Hello I am in Product class");
	}
	
	
	/*
	
	void setDetails(int id, String name, double price) //setter method
	{
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
	

	/*
	void setDetails() //setter method
	{
		id=1;
		name="Mobile";
		price=30000;
		
	}
	
	
	void setDetails(int id, String name, double price, String color) //setter method (method overloading)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	void getDetails() //getter method
	{
		System.out.println("Product details are: \nProduct id: "+id+"\nProduct name: "+name +"\nProduct price: "+price+"\n Product color: "+color);
	}
	
	public static void main(String args[])
	{
		Product p = new Product(); //object is created
		p.setDetails(1,"Mobile",30000); //setting the values for Product class via methods
		p.getDetails(); //display the details of product
		p.setDetails(2,"Mobile",30000,"black"); //setting the values for Product class via methods
		p.getDetails(); //display the details of product
	}
	*/
	
	

}
