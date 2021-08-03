package com.yash.java8;

import java.util.ArrayList;
import java.util.stream.*;

public class ProductAppStreamAPI {

	public static void main(String[] args) {
		
		ArrayList<Product> list = new ArrayList<Product>();
		
		list.add(new Product(1,"P1",1223));
		list.add(new Product(2,"P2",3456));
		list.add(new Product(3,"P3",122.34));
		list.add(new Product(4,"P4",523.6));
		
		System.out.println(list);
		
		ArrayList<Double> productPrice = (ArrayList<Double>)list.stream()
				.filter(p->p.price<=3000) //filteration on product price
				.limit(1) //limit the records to 1 : getting 0th index
				.map(p->p.price) // fetch or retrieve the list
				.collect(Collectors.toList()); //collect the fetched data and convert it into list 
											// vis toList()
		
		System.out.println(productPrice);
		
		long count = list.stream().count();	// counting no. of products
		System.out.println("No. of products are: "+count);
		
		list.stream()  
        .filter(product -> product.price == 3456)  // filtering the product name on the basis of its price
        .forEach(product -> System.out.println(product.name));    
		
		// max() method to get max Product price 
		 Product productA = list.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();    
	        System.out.println(productA.price);    
	        
	        // min() method to get min Product price    
	     Product productB = list.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();    
	        System.out.println(productB.price);    
		
		
		
		 Stream.iterate(1, element->element+1)  
        .filter(element->element%5==0)  
        .limit(5)  
        .forEach(System.out::println);  
		 
		
	}

}
