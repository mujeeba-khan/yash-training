package com.yash.javabasics.classassignments;

import java.util.Scanner;

public class Range_Main {

	public static void main(String[] args) {
		
		Range_Datatype rd = new Range_Datatype();
		System.out.println("Enter the data type: ");
		Scanner sc = new Scanner(System.in);
		String dt = sc.next();
		rd.range(dt);
	}

}
