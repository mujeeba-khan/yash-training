package com.yash.arraydemo.labassignments;

import java.util.Arrays;
import java.util.Scanner;

public class SortingProductNames {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] products = new String[5];
		System.out.println("Enter product names: \n");
		for(int i=0;i<products.length;i++)
		{
			products[i] = sc.next();
		}
		
		for(int i = 0; i<products.length-1; i++) {
	         for (int j = i+1; j<products.length; j++) {
	            if(products[i].compareTo(products[j])>0) {
	               String temp = products[i];
	               products[i] = products[j];
	               products[j] = temp;
	            }
	         }
	      }
		
		//Arrays.sort(products);
		System.out.println(Arrays.toString(products));
		
	}

}
