package com.yash.oopsconceptdemo;

public class ArrayOfObjects {

	public static void main(String[] args) {
		
		Product pr[] = new Product[5]; // array of objects of Product class
		pr[0] = new Product(12,"Laptop",43000,"black");
		pr[1] = new Product(23,"Desktop",30000,"silver");
		pr[2] = new Product(142,"Mobile",12000,"Rose gold");
		pr[3] = new Product(123,"Modem",39023,"black");
		
		for(int i=0;i<4;i++)
		{
			pr[i].getDetails();
		}

	}

}
