package com.yash.io.labassignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Question1 {

	public static void main(String[] args) {
		
		File f = new File("E:\\Java Yash training\\file1.txt");
		File f1 = new File("E:\\Java Yash training\\file2.txt");
		
		try(FileInputStream fis = new FileInputStream(f);
			FileOutputStream fos = new FileOutputStream(f1);) // try with resource
		{
			int i;
			while((i=fis.read())!=-1)
				fos.write((char)i);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
