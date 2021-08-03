package com.yash.collection;

import java.util.HashSet;

import com.yash.collection.model.Customer;

public class HashSetExample {

	public static void main(String[] args) {


		HashSet<String> h = new HashSet<String>();
		h.add("Java");
		h.add("Oracle");
		h.add("DotNet");
		h.add("Python");
		System.out.println(h);
		
		HashSet<Customer> c = new HashSet<Customer>();
		c.add(new Customer(12,"abc",23));
		c.add(new Customer(12,"abc",23));
		c.add(new Customer(12,"abc",23));
		c.add(new Customer(12,"abc",23));
		
		
	}

}
