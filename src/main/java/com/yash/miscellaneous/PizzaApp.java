package com.yash.miscellaneous;

import com.yash.miscellaneous.enums.PizzaSize;

public class PizzaApp {

	public static void main(String[] args) {


		for(PizzaSize s : PizzaSize.values())
		{
			System.out.println(s+" size : "+s.getSize());
		}

	}

}
