package com.yash.stringdemo.labassignments;

public class SectionMain {
	
	public static void main(String[] args)
	{
		Section sec = new Section();
		sec.setId(args[0]);
		sec.setName(args[1]);
		sec.setCreatedDate(args[2]);
		String sect = sec.showSectionDetail();
		System.out.println(sect);
	}

}
