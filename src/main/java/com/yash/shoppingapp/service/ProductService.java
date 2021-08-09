package com.yash.shoppingapp.service;

import java.util.ArrayList;
import java.util.List;


import com.yash.shoppingapp.model.Product;
/*
 * multiple methods in a class where the whole class will act as a single thread..
 * */

public class ProductService 
{
	List<Product> list = new ArrayList<Product>();
	double amount = 0;
	
	public void getListOfProducts()
	{
		System.out.println(list);
	}
	
	public void addProducts()
	{
		list.add(new Product(12,"tv",1,23400));
		list.add(new Product(234,"mobile",1,18000));
		list.add(new Product(323,"usb",1,600));
		list.add(new Product(3,"charger",2,500));
		
	}
	
	public void verifyProductQuantity()
	{
		System.out.println("Total type of products in your cart are: "+list.size());
		//System.out.println("Want to continue shopping ? ");
	}
	
	public void doPayment()
	{
		
		Product pro[] = list.toArray(new Product[list.size()]);
		for(int i=0;i<pro.length;i++)
		{
			amount += pro[i].getProduct_Quantity()*pro[i].getProduct_Price();
		}
		System.out.println("Thanks for shopping with us...");
		System.out.println("Your total amount : "+amount+"\nNow you will be directed to the digital payment link");
	}
	
	public void confirmPayment()
	{
		System.out.println("Your payment has been successful...Hope to see you soon..Have a Good day");
	}
	
	public void printReceipt()
	{
		System.out.println("-------ABC Bazaar--------");
		System.out.println("Products are : \n");
		System.out.println(list);
		System.out.println("Total amount : "+amount);
		System.out.println("Payment mode: Online payment");
		System.out.println("Shopping date: ");
	}
}
