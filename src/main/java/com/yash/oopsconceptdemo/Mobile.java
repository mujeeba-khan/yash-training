package com.yash.oopsconceptdemo;

public class Mobile extends Product // inheriting from parent class
{
	
	int storage;
	double camera_pixels; // child class having its own features
	
	
	Mobile()
	{
		System.out.println("Mobile constructor invoked");
	}

	public Mobile(int id, String name, double price, String color, int storage, double camera_pixels) {
		super(id, name, price, color); //calling super class constructor
		this.storage = storage;
		this.camera_pixels = camera_pixels;
	}

	void displayDetails() //getter method
	{
		System.out.println("Product details are: \nProduct id: "+id+"\nProduct name: "+name +
				"\nProduct price: "+price+"\n Product color: "+color+"\nStorage: "+storage+"\nCamera pixels: "+camera_pixels);
	}
	
	void show()
	{
		super.show();
		System.out.println("Hello I am in Mobile class");
	}
}
