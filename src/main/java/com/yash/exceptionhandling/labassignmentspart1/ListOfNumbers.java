package com.yash.exceptionhandling.labassignmentspart1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ListOfNumbers {
	
	public void readList()
	{
		File f = new File("E:\\Java Yash training\\Numbers.txt");
		try(FileInputStream fis = new FileInputStream(f))
		{
			while(true)
			{
				int x = fis.read(); 
				//if(x<48)
				if(x==-1)
				{
					break;
				}
				System.out.print((char)x);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		ListOfNumbers num = new ListOfNumbers();
		num.readList();
		

	}

}
