package com.yash.oopsconceptdemo.labassignments.inheritancepolymorphism;

public class Labrador extends Dog
{
	String name;
	String color;
	
	public Labrador(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	@Override
	public int avgBreedWeight() {
		return 80;
	}
	
	

}
