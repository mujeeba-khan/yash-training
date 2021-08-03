package com.yash.java8;

interface FunctionalDemo2
{
	public void print(String a);
}

interface FunctionalDemo
{
	public void add(int a, int b);
}

public interface FunctionalInterface 
{
	public void show(); // one abstract method
	
	public default void display() // default method
	{
		System.out.println("Welcome to java interface..");
	}
	
	public static void showName() // static method
	{
		System.out.println("Mujeeba");
	}
}
