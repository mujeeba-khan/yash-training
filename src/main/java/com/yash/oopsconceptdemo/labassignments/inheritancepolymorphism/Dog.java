package com.yash.oopsconceptdemo.labassignments.inheritancepolymorphism;

public abstract class Dog {

	String breed;
	
	public static void speak()
	{
		System.out.println("Dog Barksss...");
	}
	
	public abstract int avgBreedWeight();
	
	
}
