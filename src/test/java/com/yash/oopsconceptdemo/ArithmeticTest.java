package com.yash.oopsconceptdemo;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.yash.oopsconceptdemo.labassignments.inheritancepolymorphism.Arithmetic;

public class ArithmeticTest {

	Arithmetic ar = new Arithmetic();
	
	
	@Test
	public void test_Square_GivenZero_ShouldReturnZero() {
		
		Assertions.assertEquals(ar.square(0),0);
	}
	
	@Test
	public void test_Square_GivenPositiveValue_ShouldReturnPositiveVlue() {
		
		Assertions.assertEquals(ar.square(12),144);
	}
	
	@Test
	public void test_Square_GivenNegativeValue_ShouldReturnPositiveVlue() {
		
		Assertions.assertEquals(ar.square(-10),100);
	}

}
