package com.yash.shoppingapp.service;



public class Receipt extends Thread
{
	synchronized void printReceipt() throws InterruptedException
	{
		AddProducts ap = new AddProducts();
		System.out.println("-------ABC Bazaar--------");
		//ProductList.getListOfProducts();
		System.out.println("Total products: "+ap.addProducts().size());
		System.out.println("Total amount : "+Payment.amount);
		System.out.println("Payment mode: Online payment");
		System.out.print("Shopping date: ");
		System.out.println(java.time.LocalDate.now());  
	}
	
	public void run()
	{
		try {
			printReceipt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
