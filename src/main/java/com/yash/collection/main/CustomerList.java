package com.yash.collection.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.yash.collection.model.Customer;
import com.yash.collection.util.CustomerSortByName;
import com.yash.collection.util.CustomerSortByProductQuantity;

public class CustomerList {

	public static void main(String[] args) {


		ArrayList<Customer> cust = new ArrayList<Customer>();
		
		cust.add(new Customer(1,"John",5));
		cust.add(new Customer(2,"Genny",12));
		cust.add(new Customer(3,"Alice",4));
		cust.add(new Customer(4,"Edward",7));
		cust.add(new Customer(5,"Ken",10));
		cust.add(new Customer(6,"Bob",2));
		cust.add(new Customer(5,"Ken",10));
		cust.add(new Customer(4,"Edward",7));
		
		cust.set(2, new Customer(8,"Bella",9));
		
		System.out.println("Sorting by name\n");
		Collections.sort(cust, new CustomerSortByName());
		
		System.out.println(cust);
		
		System.out.println("\nSorting by product quantity\n");
		Collections.sort(cust, new CustomerSortByProductQuantity());
		
		System.out.println(cust);
		
		System.out.println("\nRemoving duplicate elements\n");
		
		HashSet<Customer> hs = new HashSet<>();
		hs.addAll(cust); // adding array list in hash set so as to remove the duplicate elements
		// as set contains only unique elements
		cust = new ArrayList<Customer>();
		cust.addAll(hs); // adding hash set in array list
		System.out.println(cust);
	}

}
