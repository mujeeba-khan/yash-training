package com.yash.io.labassignments;

import java.io.File;

public class Question3 {

	public static void main(String[] args) {
		
		String file_Name = args[0]; //Enter a file name 
		File f = new File("E:\\Java Yash training\\"+file_Name);
		
		if(f.exists())
		{
			if(f.isFile())
			{
				System.out.println("File name: "+f.getName()
				+"File path: "+f.getPath()
				+"File parent: "+f.getParent()
				//+"File last modified date: "+f.
				+"File last modified time: "+f.lastModified()
				+"File length: "+f.length());
			}
			else if(f.isDirectory())
			{
				System.out.println("Contents of "+file_Name+" are: ");
				String files[]  = f.list();
				for(int i=0;i<files.length;i++)
				{
					System.out.println(files[i]);
				}
			}
		}
		else
		{
			System.out.println(file_Name+" doesn't exist in Java Yash training folder kept in drive E");
		}
		
		
		

	}

}
