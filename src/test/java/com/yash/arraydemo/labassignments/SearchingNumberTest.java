package com.yash.arraydemo.labassignments;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.yash.arraydemo.labassignments.SearchingNumber;

class SearchingNumberTest {

	 SearchingNumber num = new SearchingNumber();
	
	 @Test
	 public void test_SearchNumber_GivenEmptyString_ShouldReturnNotFound() 
	 {
			
			Assertions.assertEquals(num.searchNumber(""),"Not found");
	 }
	 
	 @Test
	 public void test_SearchNumber_GivenValuePresent_ShouldReturnValue() 
	 {
			
			Assertions.assertEquals(num.searchNumber(23),"Found : 2 times");
	 }
	 
	 @Test
	 public void test_SearchNumber_GivenValueNotPresent_ShouldReturnNotFound() 
	 {
			
			Assertions.assertEquals(num.searchNumber(12),"Not found");
	 }
	 

}
