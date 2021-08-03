package com.yash.arraydemo.labassignments;

import java.util.Scanner;

public class SearchingNumber {

String searching=null;
	
	public String searchNumber(String string) 
	{
		
		if(string=="")
		{
			searching="Not found";
		}
		return searching;
	}

	public String searchNumber(int i)
	{
		
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[10];
		//boolean test=false; 
		int j, count=0;
		System.out.println("Enter 10 numbers: \n");
		for(j=0;j<10;j++)
		{
			numbers[j] = sc.nextInt();
		}
		for (int element : numbers) 
		{
            if (element == i)
            {
                //test = true;
                count++;
                //break;
            }
        }
        if(count>0)
        {
        	searching = "Found : "+count+" times";
        }
        else
        {
        	searching = "Not found";
        }
            
		return searching;
	}

	

	
}
