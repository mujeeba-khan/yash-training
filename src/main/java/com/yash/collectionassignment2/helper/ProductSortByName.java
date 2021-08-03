package com.yash.collectionassignment2.helper;

import java.util.Comparator;

import com.yash.collectionassignment2.model.*;

public class ProductSortByName implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.getProduct_Name().compareTo(p2.getProduct_Name());
		
	}

}
