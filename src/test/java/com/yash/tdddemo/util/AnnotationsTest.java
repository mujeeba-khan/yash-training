package com.yash.tdddemo.util;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnnotationsTest {

	  
    @BeforeAll
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeAll - runOnceBeforeClass eg: open db connection \n");
    }

    
    @AfterAll
    public static void runOnceAfterClass() {
        System.out.println("@AfterAll - runOnceAfterClass eg: close db connection");
    }

    
    @BeforeEach
    public void runBeforeTestMethod() {
        System.out.println("@BeforeEach - runBeforeTestMethod eg: creating a similar object for all tests");
    }

    
    @AfterEach
    public void runAfterTestMethod() {
        System.out.println("@AfterEach - runAfterTestMethod \n");
    }

    @Test
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }

    @Test
    public void test_method_2() {
        System.out.println("@Test - test_method_2");
    }

}

