package com.yash.tdddemo.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.yash.tdddemo.exception.NegativeException;

class StringCalculatorTest {

	StringCalculator cal = new StringCalculator();
	
	@Test
	public void test_StringCalculator_GivenEmptyString_ShouldReturnZero() {
		
		
		Assertions.assertEquals(cal.calculate(""),0);
	}
	
	@Test
	public void test_StringCalculator_GivenSingleValue_ShouldReturnSingleValue() {
		
		
		Assertions.assertEquals(cal.calculate("2"),2);
	}

	@Test
	public void test_StringCalculator_GivenTwoValuesDelimitedByComma_ShouldReturnSum() {
		
		
		Assertions.assertEquals(cal.calculate(2,2),4);
	}
	
	@Test
	public void test_StringCalculator_GivenTwoValuesDelimitedByLine_ShouldReturnSum() {
		
		
		Assertions.assertEquals(cal.calculate(3,"\n",5),8);
	}
	
	/*
	@Test
	public void test_StringCalculator_GivenTwoValuesDelimitedByLine1_ShouldReturnSum() {
		
		Calculator cal = new Calculator();
		Assertions.assertEquals(cal.calculate("3"+"\n"+"5"),8);
	}
	*/
	
	@Test
	public void test_StringCalculator_GivenThreeValuesDelimitedByComma_ShouldReturnSum() {
		
		
		Assertions.assertEquals(cal.calculate(3,3,5),11);
	}
	
	
	@Test
	public void test_CalculateSum_GivenNegativeValue_ExpectedException() {
		
		Assertions.assertThrows(NegativeException.class, ()->{
			cal.calculateException(-8);
			});
		
	}
	

}
