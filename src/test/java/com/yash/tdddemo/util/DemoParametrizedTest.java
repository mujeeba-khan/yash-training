package com.yash.tdddemo.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DemoParametrizedTest {

	@DisplayName("Should pass a non null arguement")
	@ParameterizedTest
	@ValueSource(strings= {"Hello","Yash","Trainees"})
	
	void shouldPassNonNullMessageAsMethodParams(String msg)
	{
		assertNotNull(msg);
	}
	

}
