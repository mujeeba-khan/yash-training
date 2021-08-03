package com.yash.productapp.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.yash.productapp.exception.EmptyProductListException;
import com.yash.productapp.exception.InvalidIdException;
import com.yash.productapp.exception.InvalidNameException;
import com.yash.productapp.exception.InvalidPriceException;
import com.yash.productapp.model.Product;

public class MainProductApp {
	
	static Product pr[] = new Product[5];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product details: ");
		
		try {
			for(int i=0;i<pr.length;i++)
			{
				System.out.println("For product "+(i+1));
				System.out.println("Id: ");
				int productId = sc.nextInt();
				invalidId(productId);
				
				System.out.println("Name: ");
				String productName = sc.next();
				invalidName(productName);
				
				System.out.println("Price: ");
				double productPrice = sc.nextDouble();
				invalidPrice(productPrice);
				
				System.out.println("Color: ");
				String productColor = sc.next();
			
				pr[i] = new Product(productId,productName,productPrice,productColor);
				emptyList();
				
				System.out.println("\nProduct details are: ");
				for(i=0;i<pr.length;i++)
				{
					pr[i].getDetails();
				}
				
			}
		}
		catch (EmptyProductListException | InvalidIdException | InvalidPriceException | InvalidNameException e) 
		{
				e.printStackTrace();
		} 
		catch(Exception e1)
		{
			e1.printStackTrace();
			//System.out.println("Ooops something went wrong.. ");
		}
		

	}
	
	
	
	
	
		public static void emptyList() throws EmptyProductListException
		{
			if(pr==null)
			{
				throw new EmptyProductListException("Empty Product list !!");
			}
		}
		
		public static void invalidId(int productId) throws InvalidIdException
		{
			if(productId<=99)
			{
				throw new InvalidIdException("Id should start from 100..");
			}
		}
		
		public static void invalidPrice(double productPrice) throws InvalidPriceException
		{
			if(1000>=productPrice && productPrice<=3000)
			{
				throw new InvalidPriceException("Price should be in range from 500 to 3000");
			}
		}
		
		public static void invalidName(String productName) throws InvalidNameException
		{
			Pattern p = Pattern.compile("^(PR-#)[A-Za-z]*[0-9]*$");
			Matcher m = p.matcher(productName);
			boolean flag = m.matches();
			if(!flag)
			{
				throw new InvalidNameException("Invalid name...follow the pattern");
			}
		}

	

}
