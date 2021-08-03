package com.yash.collection.util;

import java.util.Comparator;

import com.yash.collection.model.Customer;

public class CustomerSortByProductQuantity implements Comparator<Customer>
{

	@Override
	public int compare(Customer c1, Customer c2) 
	{
		if(c1.product_Quantity==c2.product_Quantity)  
		return 0;  
		else if(c1.product_Quantity>c2.product_Quantity)  
		return 1;  
		else  
		return -1; 
	
	}
	
}
