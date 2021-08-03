package com.yash.oopsconceptdemo.labassignments.inheritancepolymorphism;

public class Arithmetic implements Calculator
{
	@Override
	public int square(int n) {
		
		int sq = n*n;
		return sq;
		
	}

}
