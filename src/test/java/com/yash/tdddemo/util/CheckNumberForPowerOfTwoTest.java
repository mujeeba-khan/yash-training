package com.yash.tdddemo.util;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CheckNumberForPowerOfTwoTest {

	@Test
	public void test_CheckNumberForPowerOfTwo_GivenEmptyString_ShouldReturnFalse() {
		
		CheckNumberForPowerOfTwo cal = new CheckNumberForPowerOfTwo();
		Assertions.assertEquals(cal.checkNumber(""),false);
	}
	
	@Test
	public void test_CheckNumberForPowerOfTwo_GivenZero_ShouldReturnFalse() {
		
		CheckNumberForPowerOfTwo cal = new CheckNumberForPowerOfTwo();
		Assertions.assertEquals(cal.checkNumber(0),false);
	}
	
	@Test
	public void test_CheckNumberForPowerOfTwo_GivenValuesOtherThanZero_ShouldReturnTrueOrFalse_Accordingly() {
		
		CheckNumberForPowerOfTwo cal = new CheckNumberForPowerOfTwo();
		Assertions.assertEquals(cal.checkNumber(28),false);
	}

	

}
