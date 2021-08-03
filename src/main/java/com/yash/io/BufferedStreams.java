package com.yash.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreams {

	public static void main(String[] args) {

		File f = new File("E:\\Java Yash training\\BufferedFile.txt");
		
		try(FileOutputStream fos = new FileOutputStream(f); // try with resource: auto close the resources
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);) // stores data temporarily in buffer
		{ 
			String s = "Hello people...Its raining too much out there..";
			byte b[] = s.getBytes();
			bos.write(b);
			bos.flush();
			int i=0;
			while((i=bis.read())!=-1)
				System.out.print((char)i);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
		
	}

}
