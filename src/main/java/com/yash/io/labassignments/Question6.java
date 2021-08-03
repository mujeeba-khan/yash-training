package com.yash.io.labassignments;

import java.io.File;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a directory name");
		String dir = sc.next();
		File f = new File("E:\\Java Yash training\\"+dir);
		if(f.exists())
		{
			deleteContents(f);
			System.out.println("Contents successfully deleted..");
		}
		else
		{
			System.out.println("File does not exist..");
		}

	}
	
	// deleting content and its subcontents repurcussively
	
	static boolean deleteContents(File directory)
	{
		File content[] = directory.listFiles();
		if(content != null)
		{
			for(File f : content)
			{
				deleteContents(f);
			}
		}
		return directory.delete();
	}
	
	

}
