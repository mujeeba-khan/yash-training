package com.yash.java8;

import java.util.ArrayList;

/*
 * This ex is to perform various operation on collection object thru
 * traditional technique.
 * */
public class ProductApp {

	public static void main(String[] args)
	{
		
		ArrayList<Product> list = new ArrayList<Product>();
		ArrayList<Double> productPrice = new ArrayList<Double>();
		
		list.add(new Product(1,"P1",1223));
		list.add(new Product(2,"P2",3456));
		list.add(new Product(3,"P3",122.34));
		list.add(new Product(4,"P4",523.6));
		
		System.out.println(list);

		for(Product p : list)
		{
			if(p.getPrice()<3000)
			{
				//System.out.println(p);
				productPrice.add(p.getPrice());
			}
		}
		System.out.println("Filtered price: "+productPrice);
		
	}

}
