package com.yash.oopsconceptdemo.labassignments;

public class Books {
	
	String book_name;
	double book_price;
	String book_type;
	
	static int no_of_books=0;
	
	{
		no_of_books +=1;
	}
	
	
	public Books(String book_name, double book_price, String book_type) {
		super();
		this.book_name = book_name;
		this.book_price = book_price;
		this.book_type = book_type;
	}

	@Override
	public String toString() {
		return "\nBooks [book_name=" + book_name + ", book_price=" + book_price + ", book_type=" + book_type + "]";
	}

	public static void main(String args[])
	{
		Books b = new Books("AB",234,"Horror");
		Books b1 = new Books("KP",1234,"Mystery");
		Books b2 = new Books("FH",709,"Religious fiction");
		
		System.out.println(b+"\n"+b1+"\n"+b2);
		System.out.println("Total no. of books written: "+no_of_books);
	}
	
}
