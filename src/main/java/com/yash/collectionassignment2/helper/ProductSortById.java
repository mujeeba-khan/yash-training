package com.yash.collectionassignment2.helper;

import java.util.Comparator;

import com.yash.collectionassignment2.model.*;

public class ProductSortById implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		
		if(p1.getProduct_Id()==p2.getProduct_Id())  
			return 0;  
			else if(p1.getProduct_Id()>p2.getProduct_Id())  
			return 1;  
			else  
			return -1; 
	}

}
