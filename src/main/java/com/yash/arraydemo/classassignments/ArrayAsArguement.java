package com.yash.arraydemo.classassignments;

public class ArrayAsArguement {
	
	public static void min(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.println(""+arr[i]);
	}

	
	public static void main(String args[])
	{
		int arr[] = {1,2,3,5,6};
		min(arr);
	}
}
