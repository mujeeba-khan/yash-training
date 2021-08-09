package com.yash.shoppingapp;

import java.util.ArrayList;
import java.util.List;

import com.yash.shoppingapp.model.Product;


class ProductList extends Thread
{
	
	synchronized void getListOfProducts()
	{/*
		System.out.println("List of products..");
		List<Product> list1 = AddProducts.addProducts();
		System.out.println(list1); */
	}
	
	public void run()
	{
		getListOfProducts();
	}
}

class AddProducts extends Thread
{
	
	synchronized void addProducts()
	{
		//System.out.println("Products added..\n");
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(12,"P1",5,230));
		list.add(new Product(34,"P2",12,21344));
		list.add(new Product(89,"P3",4,587.6));
		list.add(new Product(32,"P4",8,376.3));
		list.add(new Product(9,"P5",1,445.2));
		
		System.out.println("List of products..");
		System.out.println(list);
	}
	
	public void run()
	{
		addProducts();
	}
}

class VerifyProductQuantity extends Thread
{
	synchronized void verifyProductQuantity()
	{
		
		System.out.println("\nTotal type of products in your cart are: 5\n"); 
		//System.out.println("Want to continue shopping ? ");
	}
	
	public void run()
	{
		verifyProductQuantity();
	}
}

class Payment extends Thread
{
	static double amount=22983.1;
	synchronized void doPayment()
	{		
		System.out.println("Thanks for shopping with us...");
		System.out.println("Your total amount : "+amount+"\nNow you will be directed to the digital payment link\n");
		
	}
	
	public void run()
	{
		doPayment();
		System.out.println("Your payment has been successful...Hope to see you soon..Have a Good day\n");
	}
}

class Receipt extends Thread
{
	synchronized void printReceipt()
	{
		
		System.out.println("-------ABC Bazaar Receipt--------");
		//ProductList.getListOfProducts();
		System.out.println("Total products: 5");
		System.out.println("Total amount : 22983.1");
		System.out.println("Payment mode: Online payment");
		System.out.print("Shopping date: ");
		System.out.println(java.time.LocalDate.now());  
	}
	
	public void run()
	{
		printReceipt();
	}
}

public class ProductAppSynch
{

	public static void main(String[] args) 
	{
		
		AddProducts t1 = new AddProducts();
		t1.start();
		ProductList t2 = new ProductList();
		t2.start();
		VerifyProductQuantity t3 = new VerifyProductQuantity();
		t3.start();
		Payment t4 = new Payment();
		t4.start();
		Receipt t5 = new Receipt();
		t5.start();
		
		
		
		
		
		
	}

}
