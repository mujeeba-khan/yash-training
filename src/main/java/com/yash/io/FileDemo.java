package com.yash.io;

import java.io.*;

public class FileDemo {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("E:\\Java Yash training\\demo.txt");
			System.out.println("File name: "+f.getName()
			+"\nFile path: "+f.getPath()+
			"\nFile parent: "+f.getParent()
			+"\nFile exists: "+f.exists());
			
			File f1 = new File("E:\\Java Yash training\\newDemo.txt");
			f1.createNewFile(); //creating a new file only if it doesnt exist
			System.out.println("");
			
			f.renameTo(f1);
			
			f1.delete(); // deleting the file
			
			File f2 = new File("E:\\Java Yash training");
			String file[] = f2.list(); // listing all d files which are present in this directory
			System.out.println("List of files are: ");
			for(int i=0;i<file.length;i++)
			{
				System.out.println(file[i]);
			}
			
			File f3 = new File("E:\\Java Yash training\\iodemo");
			f3.mkdir(); // created an empty directory
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
