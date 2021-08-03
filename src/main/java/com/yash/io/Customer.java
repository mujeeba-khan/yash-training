package com.yash.io;

import java.io.Serializable;

public class Customer implements Serializable
{
	
	int id;
	String name;
	String date;
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	

}
