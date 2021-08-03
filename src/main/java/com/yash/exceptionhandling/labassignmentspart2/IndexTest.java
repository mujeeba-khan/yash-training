package com.yash.exceptionhandling.labassignmentspart2;

import java.util.Scanner;

public class IndexTest {

	public static void main(String[] args) {
		
		int i;
		String firstNames[] = new String[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 names: ");
		for(i=0;i<firstNames.length;i++)
		{
			firstNames[i] = sc.next();
		}

		try {
			
			System.out.println("Enter a position: ");
			int pos = sc.nextInt();
			System.out.println("Name at position "+pos+" is: "+firstNames[pos-1]);
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You can enter position from 1 to 10 only");
		}
	}

}
