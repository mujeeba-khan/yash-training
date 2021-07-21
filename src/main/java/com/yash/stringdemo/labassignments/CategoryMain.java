package com.yash.stringdemo.labassignments;

public class CategoryMain {

	public static void main(String[] args) {
		
		Category cat = new Category();
		cat.setId(args[0]);
		cat.setName(args[1]);
		cat.setCreatedDate(args[2]);
		String category =cat.showCategoryDetail();
		System.out.println(category);

	}

}
