package com.yash.collection.util;

import java.util.Comparator;

import com.yash.collection.model.Customer;

public class CustomerSortByName implements Comparator<Customer>
{

	@Override
	public int compare(Customer c1, Customer c2) {
		
		return c1.customer_Name.compareTo(c2.customer_Name);
		
	}

}
