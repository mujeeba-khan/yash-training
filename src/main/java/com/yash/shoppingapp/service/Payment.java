package com.yash.shoppingapp.service;

import java.util.List;
import com.yash.shoppingapp.model.Product;

public class Payment extends Thread
{

	static double amount=0;
	void doPayment()
	{
		synchronized(this)
		{
			try 
			{
				Thread.sleep(400);
				AddProducts ap = new AddProducts();
				List<Product> list = ap.addProducts();
				Product pro[] = list.toArray(new Product[list.size()]);
				for(int i=0;i<pro.length;i++)
				{
					amount += pro[i].getProduct_Quantity()*pro[i].getProduct_Price();
				}

				System.out.println("Thanks for shopping with us...");
				System.out.println("Your total amount : "+amount+"\nNow you will be directed to the digital payment link\n");
				notify();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	synchronized double confirmPayment()
	{
		return amount;
	}
	
	public void run()
	{
		doPayment();
		System.out.println("Your payment has been successful...Hope to see you soon..Have a Good day\n");
		confirmPayment(); 
	}
	
}
