package com.yash.tdddemo.util;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;


	@RunWith(JUnitPlatform.class)
	@SelectPackages("com.yash.tdddemo.util")
	
	public class DemoSuiteTest{
		
		
		
	}
	
	/*
	
	@RunWith(JUnitPlatform.class)
	@SelectPackages({AnnotaionsTest.class, DemoParamaterizedTest.class, CalculateSumTest.class})
	
	public class DemoSuiteTest{
		
		
		
	}
	
	*/