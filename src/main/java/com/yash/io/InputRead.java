package com.yash.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class InputRead {

	public static void main(String[] args) {


		try {
			
			File f = new File("E:\\Java Yash training\\Newfile.txt");
			System.out.println("File content: \nvia FileInputStream ");
			
			FileInputStream fis = new FileInputStream(f); //can store binary data: images, videos, audio, pdf 
			int i;
			while((i=fis.read())!=-1)
				System.out.print((char)i);
			
			System.out.println("\nvia FileReader"); // can store only textual data
			FileReader fr = new FileReader(f);
			while((i=fr.read())!=-1)
				System.out.print((char)i);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
