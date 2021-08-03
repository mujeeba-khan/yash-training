package com.yash.collectionassignment2.helper;

import java.util.Comparator;

import com.yash.collectionassignment2.model.*;

public class ProductSortByPrice implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		
		if(p1.getProduct_Price()==p2.getProduct_Price())  
			return 0;  
			else if(p1.getProduct_Price()>p2.getProduct_Price())  
			return 1;  
			else  
			return -1; 
	}

}
