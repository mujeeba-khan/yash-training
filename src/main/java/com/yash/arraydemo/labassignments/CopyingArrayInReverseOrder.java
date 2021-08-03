package com.yash.arraydemo.labassignments;

import java.util.Scanner;

public class CopyingArrayInReverseOrder {

		static void printArray(int arr[], int len)
		{
		    int i;
		    for (i = 0; i < len; i++)
		    {
		        System.out.println(arr[i]);
		    }
		}
		 
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int numbers[] = new int[5],j,i;
			int len = numbers.length;
			System.out.println("Enter 5 numbers: \n");
			for(j=0;j<len;j++)
			{
				numbers[j] = sc.nextInt();
			}
		
		    int copied_arr[] = new int[len];
		    for (i = 0; i < len; i++)
		    {
		        copied_arr[i] = numbers[len - i - 1];
		    }
		
		    System.out.printf("\nOriginal array:\n");
		    printArray(numbers, len);
		 
		    System.out.printf("\nCopied array:\n");
		    printArray(copied_arr, len);
		    
		}

	

}
