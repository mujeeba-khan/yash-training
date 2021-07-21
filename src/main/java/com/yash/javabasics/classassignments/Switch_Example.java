package com.yash.javabasics.classassignments;

import java.util.Scanner;

public class Switch_Example {
	
	public static void main(String ergs[])
	{
		System.out.print("Enter toatal marks out of 500: ");
		Scanner sc = new Scanner(System.in);
		float totalMarks = sc.nextFloat();
		float percentage = (totalMarks / 500) * 100;
		 
        
        switch ((int) percentage / 10) {
        case 9:
            System.out.println("Grade : A+");
            break;
        case 8:
        case 7:
            System.out.println("Grade : A");
            break;
        case 6:
            System.out.println("Grade : B");
            break;
        case 5:
            System.out.println("Grade : C");
            break;
        default:
            System.out.println("Grade : D");
            break;
		
        }

	}
}
