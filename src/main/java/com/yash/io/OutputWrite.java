package com.yash.io;

import java.io.*;

public class OutputWrite {

	public static void main(String[] args) {
		
		FileOutputStream fos;
		
	try {
			File f = new File("E:\\Java Yash training\\Writefile.txt");
			fos = new FileOutputStream(f);
			String s = "Hello people...Its raining too much out there..and I am from File Output Stream..";
			byte b[] = s.getBytes();
			fos.write(b);
			
			FileWriter fw = new FileWriter(f);
			String s1 = "Hello...I am coming from File Writer..";
			//int b1 = s1.getBytes();
			fw.write(s1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
