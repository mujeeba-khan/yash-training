package com.yash.miscellaneous;

import com.yash.miscellaneous.enums.Color;
import com.yash.miscellaneous.enums.Rainbow;

public class ImplementingColors {

	public static void main(String[] args) {
		
		System.out.println("Color of the sky is: "+ Color.BLUE);
		System.out.println("Color of the blood is: "+ Color.RED);
		System.out.println("Color of the mango is: "+ Color.YELLOW);
		System.out.println("Color of the moon is: "+ Color.WHITE);
		
		Rainbow arr[] = Rainbow.values();
		System.out.println("\nRainbow is made of VIBGYOR: ");
		for(Rainbow rb : arr)
		{
			System.out.println(rb);
		}

	}

}
