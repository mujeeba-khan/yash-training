package com.yash.io.labassignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Question2 {

	public static void main(String[] args) {


		try 
		{
			File f1 = new File("E:\\Java Yash training\\company");
			if(!f1.exists())
			{
				f1.mkdir();
			}
				File f2 = new File("E:\\Java Yash training\\company\\basicInfo.txt");
				if(!f2.exists())
				{
					f2.createNewFile();
				}
				FileOutputStream fos = new FileOutputStream(f2);
				String s = "Welcome to the company";
				byte b[] = s.getBytes();
				fos.write(b);
				
				FileInputStream fis = new FileInputStream(f2);
				int i;
				while((i=fis.read())!=-1)
					System.out.print((char)i);
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
