package com.yash.shoppingapp.main;

import com.yash.shoppingapp.service.AddProducts;
import com.yash.shoppingapp.service.Payment;
import com.yash.shoppingapp.service.ProductList;
import com.yash.shoppingapp.service.Receipt;
import com.yash.shoppingapp.service.VerifyProductQuantity;

public class NewProductApp {

	public static void main(String[] args) 
	{
		try 
		{
			AddProducts t1 = new AddProducts();
			//t1.start();
			ProductList t2 = new ProductList();
			//t2.start();
			VerifyProductQuantity t3 = new VerifyProductQuantity();
			//t3.start();
			Payment t4 = new Payment();
			//t4.start();
			Receipt t5 = new Receipt();
			//t5.start();

			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();

			t1.join();
			t2.join();
			t3.join();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
