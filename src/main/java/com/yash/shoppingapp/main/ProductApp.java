package com.yash.shoppingapp.main;

import com.yash.shoppingapp.service.ProductService;

class Thread1 extends Thread
{
	ProductService ps;
	
	Thread1(ProductService ps)
	{
		this.ps = ps;
	}
	
	public void run()
	{
		ps.addProducts();
		ps.getListOfProducts();
		ps.verifyProductQuantity();
		ps.doPayment();
		ps.confirmPayment();
		ps.printReceipt();
		
		try {
			Thread.currentThread().join(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Thread2 extends Thread
{
	ProductService ps;
	
	Thread2(ProductService ps)
	{
		this.ps = ps;
	}
	
	public void run()
	{
		try 
		{
			ps.addProducts();
			ps.getListOfProducts();
			ps.verifyProductQuantity();
			ps.doPayment();
			ps.confirmPayment();
			ps.printReceipt();
			Thread.sleep(400);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}


public class ProductApp {

	public static void main(String[] args) 
	{
		
		ProductService ps1 = new ProductService();
		
		Thread1 t1 = new Thread1(ps1);
		Thread1 t2 = new Thread1(ps1);
		
		t1.start();
		
		System.out.println("t1 is alive: "+t1.isAlive());
		
		t2.start();
		
		
		
		
	}

}
