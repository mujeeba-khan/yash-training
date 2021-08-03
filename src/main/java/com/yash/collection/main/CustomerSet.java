package com.yash.collection.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.yash.collection.model.Customer;
import com.yash.collection.util.CustomerSortByName;
import com.yash.collection.util.CustomerSortByProductQuantity;

public class CustomerSet {

	public static void main(String[] args) 
	{
		HashSet<Customer> cust = new HashSet<Customer>();
		cust.add(new Customer(1,"John",5));
		cust.add(new Customer(2,"Genny",12));
		cust.add(new Customer(3,"Alice",4));
		cust.add(new Customer(4,"Edward",7));
		cust.add(new Customer(3,"Alice",4));
	//	cust.add(null);
	//	cust.add(null); // no matter how many null values we add it will print only one
		
		System.out.println(cust);
		
		System.out.println("\nSorted Customer Set by name\n");
		
		TreeSet<Customer> ts = new TreeSet<Customer>(new CustomerSortByName());// store the elements in a sorted order
		ts.addAll(cust); // while storing null values in tree set it has thrown null pointer exception
		
		System.out.println(ts);
		
		System.out.println("\nSorted Customer Set by product quantity\n");
		
		TreeSet<Customer> ts1 = new TreeSet<Customer>(new CustomerSortByProductQuantity());
		ts1.addAll(cust);
		
		System.out.println(ts1);
		
		LinkedHashSet<Customer> lhs = new LinkedHashSet<Customer>();
		lhs.addAll(cust);
		lhs.add(new Customer(1,"John",5));
		lhs.add(new Customer(2,"Genny",12));
		lhs.add(new Customer(3,"Alice",4));
		lhs.add(new Customer(4,"Edward",7));
		System.out.println("\nCustomer ordered set\n"+lhs);
		

	}

}
