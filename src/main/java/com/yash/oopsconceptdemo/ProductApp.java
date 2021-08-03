package com.yash.oopsconceptdemo;

/**
 * Hello world!
 *
 */
public class ProductApp 
{
    public static void main( String[] args )
    {
    	/*Product p = new Product(); //object is created
		p.setDetails(1,"Mobile",30000); //setting the values for Product class via methods
		p.getDetails(); //display the details of product
		p.setDetails(2,"Mobile",30000,"black"); //setting the values for Product class via methods
		p.getDetails(); //display the details of product
		
		//Customer c = new Customer();
		//c.getDetails();  //here access modifiers matter when object of another class is accessing data members
		*/
    	
    	Product p = new Product();
    	Product p1 = new Product(1,"Mobile",30000);
    	Product p2 = new Product(1,"Mobile",30000,"black");
    	
    	p1.getDetails();
    	p2.getDetails();
    	
    	Mobile m = new Mobile(1,"Samsung",20000,"black",64,13.0);
    	m.displayDetails();
    	m.show();
    	
    }
}
