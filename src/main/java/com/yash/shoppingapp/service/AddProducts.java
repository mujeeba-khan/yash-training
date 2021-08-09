package com.yash.shoppingapp.service;

import java.util.ArrayList;
import java.util.List;

import com.yash.shoppingapp.model.Product;

public class AddProducts extends Thread
{
	public List<Product> addProducts() 
	{
		
			//System.out.println("Products added..\n");
			List<Product> list = new ArrayList<Product>();
			list.add(new Product(12,"P1",5,230));
			list.add(new Product(34,"P2",12,21344));
			list.add(new Product(89,"P3",4,587.6));
			list.add(new Product(32,"P4",8,376.3));
			list.add(new Product(9,"P5",1,445.2));

			//wait();
			
			return list;
				
		
	}
	
	public void run()
	{
		try
		{
			addProducts();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
