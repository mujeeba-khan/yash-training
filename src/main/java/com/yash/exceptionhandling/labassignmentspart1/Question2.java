package com.yash.exceptionhandling.labassignmentspart1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Question2 { //related to file handling

	public static void main(String args[]) throws IOException
	{
		//File f = new File("E:\\Java Yash training\\Myfile.txt"); //file was not available so 
																//it gave FileNotFoundException
		
		//File f = new File("E:\\Java Yash training\\Myfilee.txt"); //file with a wrong name will also gives FNFE
		
		File f = new File("E:\\Java Yash training\\Myfile.txt");
		try(FileInputStream fis = new FileInputStream(f))
		{
			while(true)
			{
				int x = fis.read(); // when Myfile.txt got created it has read it
				if(x==-1)
				{
					break;
				}
				System.out.print((char)x);
			}
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
	// reading an empty file wont give any exception, it just prints nothing
	
}
