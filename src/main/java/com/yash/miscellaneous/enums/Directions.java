package com.yash.miscellaneous.enums;

public enum Directions {

	NORTH(2), 
	SOUTH(4), 
	EAST(6), 
	WEST(8);
	
	public int val;
	
	private Directions(int val)
	{
		this.val=val;
	}
	
}
