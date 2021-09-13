package com.yash.springdemo;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("cust")
public class Customer 
{
	private int id;
	private String name;
	private List<String> products; 

	public Customer() {}
	
	public Customer(int id, String name, List<String> products) {
		super();
		this.id = id;
		this.name = name;
		this.products=products;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("Products are:");  
	    Iterator<String> itr=products.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
		
}
