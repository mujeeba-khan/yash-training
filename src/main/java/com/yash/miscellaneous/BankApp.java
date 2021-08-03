package com.yash.miscellaneous;

import com.yash.miscellaneous.enums.BankNames;

public class BankApp {

	public static void main(String[] args) {


		for(BankNames n : BankNames.values())
		{
			System.out.println(n);
		}

	}

}
