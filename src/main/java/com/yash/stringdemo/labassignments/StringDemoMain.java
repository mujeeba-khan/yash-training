package com.yash.stringdemo.labassignments;

public class StringDemoMain {

	public static void main(String[] args) {
		
		StringDemo sd = new StringDemo();
		String unchanged = sd.getRequiredData(args[0]);
		System.out.println(unchanged);
	}

}
