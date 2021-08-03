package com.yash.collectionassignment2.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import com.yash.collectionassignment2.helper.ProductSortById;
import com.yash.collectionassignment2.helper.ProductSortByName;
import com.yash.collectionassignment2.helper.ProductSortByPrice;
import com.yash.collectionassignment2.model.*;
import com.yash.collectionassignment2.exception.NullProductException;

public class ProductApp {
	
	static HashSet<Product> pro = new HashSet<Product>();

	public static void main(String[] args) {
		
		pro.add(new Product(12,"Biscuits",90));
		pro.add(new Product(34,"Chips",50));
		pro.add(new Product(23,"Chocalates",120.4));
		pro.add(new Product(89,"Sweets",230.56));
		pro.add(new Product(46,"Waffers",78.5));
		pro.add(new Product(46,"Waffers",78.5));
		//pro.add(null);
			
		try
		{
			nullProduct();

			int size = pro.size();
			System.out.println("Total items: "+size);

			HashSet<Product> proCopy = new HashSet<Product>();
			proCopy = (HashSet)pro.clone();
			System.out.println("Copied set: "+proCopy);

			System.out.println("\nProducts sort by id: \n");

			TreeSet<Product> ts1 = new TreeSet<Product>(new ProductSortById());
			ts1.addAll(pro);

			System.out.println(ts1);

			System.out.println("\nProducts sort by name: \n");

			TreeSet<Product> ts2 = new TreeSet<Product>(new ProductSortByName());
			ts2.addAll(pro);

			System.out.println(ts2);

			System.out.println("\nProducts sort by price: \n");

			TreeSet<Product> ts3 = new TreeSet<Product>(new ProductSortByPrice());
			ts3.addAll(pro);

			System.out.println(ts3);

			LinkedHashSet<Product> proOrd = new LinkedHashSet<Product>();
			proOrd.add(new Product(12,"Biscuits",90));
			proOrd.add(new Product(34,"Chips",50));
			proOrd.add(new Product(23,"Chocalates",120.4));
			proOrd.add(new Product(89,"Sweets",230.56));
			proOrd.add(new Product(46,"Waffers",78.5));
			proOrd.add(new Product(46,"Waffers",78.5));

			System.out.println("\nOrdered set: "+proOrd);

			Product pt[] = proOrd.toArray(new Product[proOrd.size()]);
			System.out.println("\nFirst item : " + pt[0]);
			System.out.println("\nLast item : " + pt[pt.length-1]);

		} 
		catch (NullProductException e) {

			e.printStackTrace();
		}
		
	}
	
	public static void nullProduct() throws NullProductException
	{
		
		Product pt1[] = pro.toArray(new Product[pro.size()]);
		for(int i=0;i<pt1.length;i++)
		{
			if(pt1[i]==null)
			{
				throw new NullProductException("Values of product can't be null !!");
			}
		}
		
	}

}
