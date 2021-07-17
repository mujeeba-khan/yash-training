package com.yash.tdddemo.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.yash.tdddemo.exception.NegativeException;

class CalculateSumTest {
	
	CalculateSum cal = new CalculateSum();

	@Test
	public void test_CalculateSum_GivenEmptyString_ShouldReturnSumZero() {
		
		Assertions.assertEquals(cal.calculateSum(""),0);
	}
	
	@Test
	public void test_CalculateSum_GivenNumberLessThan3_ShouldReturnSumZero() {
		
		Assertions.assertEquals(cal.calculateSum(2),0);
	}
	

	@Test
	public void test_CalculateSum_GivenNumberGreaterThan3_ShouldReturnSum() {
		
		Assertions.assertEquals(cal.calculateSum(10),33);
	}
	
	@Test
	public void test_CalculateSum_GivenNegativeValue_ExpectedException() {
		
		Assertions.assertThrows(NegativeException.class, ()->{
			cal.calculateSumException(-8);
			});
		
	}

}
