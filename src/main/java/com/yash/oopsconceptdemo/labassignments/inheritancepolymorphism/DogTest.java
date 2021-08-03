package com.yash.oopsconceptdemo.labassignments.inheritancepolymorphism;

public class DogTest {

	public static void main(String[] args) {
		
		Dog.speak();
		
		Labrador lab = new Labrador("Tom","creamish");
		lab.speak();
		System.out.println("Avg breed weight: "+lab.avgBreedWeight());
		
		Yorkshire york = new Yorkshire();
		york.speak();
		System.out.println("Avg breed weight for Yorkshire: "+york.avgBreedWeight());

	}

}
