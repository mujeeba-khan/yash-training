package com.yash.collection;

import java.util.HashMap;

import com.yash.collection.model.Customer;

public class HashMapExample {

	public static void main(String[] args) {


		HashMap<Integer,Customer> hs = new HashMap<Integer,Customer>();
		
		Customer c1 = new Customer(12,"Avi",2);
		Customer c2 = new Customer(33,"John",4);
		Customer c3 = new Customer(78,"Sam",6);
		Customer c4 = new Customer(21,"Bob",2);
		
		hs.put(c1.getCustomer_Id(), c1);
		hs.put(c2.getCustomer_Id(), c2);
		hs.put(c3.getCustomer_Id(), c3);
		hs.put(c4.getCustomer_Id(), c4);
		
		System.out.println(hs.get(12));
		
		

	}

}
