package com.yash.miscellaneous;

import com.yash.miscellaneous.enums.Directions;

public class ImplementingDirections {

	public static void main(String[] args) {
		
		System.out.println("Directions and its values are: ");
		
		for(Directions d : Directions.values())
		{
			System.out.println(d + " "+d.val);
		}

	}

}
