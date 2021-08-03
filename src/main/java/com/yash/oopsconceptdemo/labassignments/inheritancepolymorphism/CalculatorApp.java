package com.yash.oopsconceptdemo.labassignments.inheritancepolymorphism;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {


		Arithmetic ar = new Arithmetic();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. ");
		int n = sc.nextInt();
		System.out.println("Sqaure: "+ar.square(n));

	}

}
