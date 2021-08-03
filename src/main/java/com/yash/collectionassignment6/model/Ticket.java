package com.yash.collectionassignment6.model;

public class Ticket 
{
	int quantity;
	String block;
	String movie;
	int price;
	
	
	public Ticket() {
		super();
	}
	
	public Ticket(int quantity, String block, String movie, int price) {
		super();
		this.quantity = quantity;
		this.block = block;
		this.movie = movie;
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public String getBlock() {
		return block;
	}
	public String getMovie() {
		return movie;
	}
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Ticket [quantity=" + quantity + ", block=" + block + ", movie=" + movie + ", price=" + price + "]";
	}
	
	
}
