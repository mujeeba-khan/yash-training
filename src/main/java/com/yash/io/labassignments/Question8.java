package com.yash.io.labassignments;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question8 {

	public static void main(String[] args) {


		File f = new File("E:\\Java Yash training\\Newfile.txt");
		Path p = Paths.get("E:\\\\Java Yash training\\\\Newfile.txt");
		try 
		{
			byte data[] = Files.readAllBytes(p);
			System.out.println(data);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
