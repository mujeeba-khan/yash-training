package com.yash.exceptionhandling.labassignmentspart1;

public class Question4 { // using Product class

	public static void main(String[] args) {
		
		Product p[] = new Product[5];
	//	Product p[] = new Product[4];
		p[0] = new Product(1,"Maggi",30);
		p[1] = new Product(2,"Biscuits",50);
		p[2] = new Product(3,"Dairy milk",80);
		p[3] = new Product(4,"Chips",60);
		
		try {
			
			for(Product p1 : p)
			{
				p1.getDetails();
			}
			
			p[6] = new Product(5,"Perk",20);
			
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException: Object is not assigned to p[4]. Please assign object to p[4]");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException: You are trying to assigned the objects beyond the limit of array.");
		}
		
		
		

	}

}
