package com.yash.arraydemo.labassignments;

import java.util.Scanner;

public class ListOfProductsWithDuplicateValues {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int product_values[] = new int[4],j,i,m,k,count;
		int len = product_values.length;
		String products[] = new String[len];
		
		System.out.println("Enter product and product values: \n");
		for(j=0;j<len;j++)
		{
			products[j] = sc.nextLine();
			product_values[j] = sc.nextInt();
		}
			
		System.out.println("Products with duplicate values: \n");
       
        for(i=0; i<len; i++)
        {  
            count = 1;  
            for(m=i+1;m<len;m++) 
            {  
                if(product_values[i] == product_values[m]) 
                {  
                    count++;  
                    product_values[m] = '0';  
                }  
            }   
            if(count > 1 && product_values[i] != '0')  
            {
            	System.out.println(products[i]); 
            }
    
        } 
        
    

	}

}
