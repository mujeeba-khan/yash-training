package com.yash.shoppingapp.service;

import java.util.ArrayList;
import java.util.List;
import com.yash.shoppingapp.model.Product;

public class ProductList extends Thread
{

	
	void getListOfProducts()
	{
		AddProducts ap = new AddProducts();
		System.out.println("List of products..\n");
		List<Product> list1 = ap.addProducts();
		System.out.println(list1);
	}
	
	public void run()
	{
		getListOfProducts();
	}
	
	
	/*
	void getListOfProducts()
	{
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(12,"P1",5,230));
		list.add(new Product(34,"P2",12,21344));
		list.add(new Product(89,"P3",4,587.6));
		list.add(new Product(32,"P4",8,376.3));
		list.add(new Product(9,"P5",1,445.2));
		System.out.println("List of products..\n");
		System.out.println(list);
	}
	
	public void run()
	{
		getListOfProducts();
	}
	*/
}
