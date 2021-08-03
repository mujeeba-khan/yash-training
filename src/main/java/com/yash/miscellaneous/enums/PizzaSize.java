package com.yash.miscellaneous.enums;

public enum PizzaSize {
	
	SMALL(3),
	MEDIUM(5),
	LARGE(12);
	
	int size;
	 
	private PizzaSize(int size)
	{
		this.size = size;
	}
	
	public int getSize()
	{
		return size;
	}

}
