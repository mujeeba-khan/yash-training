package com.yash.springwithannot1;

import org.springframework.stereotype.Component;

@Component()
public class Product
{
	 public void sold()
	 {
		 System.out.println("Product is out of stock!!!");
	 }
}
