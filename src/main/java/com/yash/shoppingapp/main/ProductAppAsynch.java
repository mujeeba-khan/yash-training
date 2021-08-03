package com.yash.shoppingapp.main;


class ProductList extends Thread
{
	public void getListOfProducts()
	{
		System.out.println("List of products..\n");
		
	}
	
	public void run()
	{
		getListOfProducts();
	}
}

class AddProducts extends Thread
{
	
	public void addProducts()
	{
		System.out.println("Products added..\n");
	
	}
	
	public void run()
	{
		addProducts();
	}
}

class VerifyProductQuantity extends Thread
{
	public void verifyProductQuantity()
	{
		
		System.out.println("Total type of products in your cart are: 5\n");
		//System.out.println("Want to continue shopping ? ");
	}
	
	public void run()
	{
		verifyProductQuantity();
	}
}

class Payment extends Thread
{
	public void doPayment()
	{
		
		System.out.println("Thanks for shopping with us...");
		System.out.println("Your total amount : 45930\nNow you will be directed to the digital payment link\n");
		
	}
	
	synchronized public void confirmPayment()
	{
		System.out.println("Your payment has been successful...Hope to see you soon..Have a Good day\n");
	}
	
	public void run()
	{
		doPayment();
		confirmPayment();
	}
}

class Receipt extends Thread
{
	public void printReceipt()
	{
		
		System.out.println("-------ABC Bazaar--------");
		System.out.println("Products are : \n");
		
		System.out.println("Total amount : 45930");
		System.out.println("Payment mode: Online payment");
		System.out.println("Shopping date: 29-7-2021");
	}
	
	public void run()
	{
		printReceipt();
	}
}


public class ProductAppAsynch 
{
	public static void main(String[] args) 
	{
		
		AddProducts t1 = new AddProducts();
		ProductList t2 = new ProductList();
		VerifyProductQuantity t3 = new VerifyProductQuantity();
		Payment t4 = new Payment();
		Receipt t5 = new Receipt();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}
}
