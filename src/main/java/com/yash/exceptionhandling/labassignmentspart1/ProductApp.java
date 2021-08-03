package com.yash.exceptionhandling.labassignmentspart1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductApp { // Question 5

	int productId;
	String productName;
	double productPrice;
	
	
	public ProductApp(String productName, double productPrice) {
		super();
		this.productId++;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	
	@Override
	public String toString() {
		return "[productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product details: ");
		
		ProductApp pr[] = new ProductApp[2];
		
		try {
		for(int i=0;i<pr.length;i++)
		{
			System.out.println("For product "+(i+1));
			System.out.println("Name: ");
			String productName = sc.next();
			System.out.println("Price: ");
			double productPrice = sc.nextDouble();
		
			pr[i] = new ProductApp(productName,productPrice);
			
		}
		}catch(NumberFormatException | InputMismatchException e)
		{
			System.out.println("Wrong type for name or price");
		}
	
		
		System.out.println("Product details are: ");
		for(int i=0;i<pr.length;i++)
		{
			System.out.println("Product "+(i+1)+" -\n"+pr[i]);
		}


	}

}
