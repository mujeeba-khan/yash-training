package com.yash.tdddemo.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class IncreasingNumberTest {

	@Test
	public void test_IncreasingNumber_GivenEmptyString_ShouldReturnFalse() {
		
		IncreasingNumber cal = new IncreasingNumber();
		Assertions.assertEquals(cal.checkNumber(""),false);
	}
	
	@Test
	public void test_IncreasingNumber_GivenValue_ShouldReturnTrueorFalse_Accordingly() {
		
		IncreasingNumber cal = new IncreasingNumber();
		Assertions.assertEquals(cal.checkNumber(234567),true);
	}
	
}
