package com.yash.exceptionhandling;

public class Assertion {

	public static void main(String[] args) {

		  int age = 14;
	      assert age <= 18 : "Cannot Vote";
	      System.out.println("The voter's age is " + age);
		

	}

}

/*An assertion is a statement in Java which ensures the correctness of any assumptions 
 * which have been done in the program. When an assertion is executed, it is assumed to be true. If the assertion is false, the JVM will throw an Assertion error. It finds it application primarily in the testing purposes. Assertion statements are used along with boolean expressions.
 Assertions in Java can be done with the help of the assert keyword. There are two ways in which an assert statement can be used.
 */

