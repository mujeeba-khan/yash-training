package com.yash.dealerapp.model;

/*
 * Product POJO class 
 * which will have a has-A relationship with Dealer class
 * 
 */
public class Product 
{
	private int id;
	private String name;
	private String description;
	
	public Product()
	{
		
	}
	
	public Product(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
}
