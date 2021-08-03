package com.yash.shoppingapp.service;

public class VerifyProductQuantity extends Thread
{

	synchronized void verifyProductQuantity() throws InterruptedException
	{
		AddProducts ap = new AddProducts();
		System.out.println("Total type of products in your cart are: "+ap.addProducts().size()+"\n"); 
		//System.out.println("Want to continue shopping ? ");
		
		wait();
	}
	
	public void run()
	{
		try {
			verifyProductQuantity();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
