package com.yash.tdddemo.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculateDifferenceTest {

	@Test
	public void test_CalculateDifference_GivenEmptyString_ShouldReturnDifferenceZero() {
		
		CalculateDifference cal = new CalculateDifference();
		Assertions.assertEquals(cal.calculateDifference(""),0);
	}
	
	@Test
	public void test_CalculateDifference_GivenValue_ShouldReturnDifference() {
		
		CalculateDifference cal = new CalculateDifference();
		Assertions.assertEquals(cal.calculateDifference(4),-70);
	}
}
