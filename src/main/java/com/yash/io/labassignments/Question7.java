package com.yash.io.labassignments;

import java.io.File;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a directory name");
		String dir = sc.next();
		File f = new File("E:\\Java Yash training\\"+dir);
		if(f.exists())
		{
			f.setReadOnly();
			System.out.println("");
		}
		else
		{
			System.out.println("File does not exist..");
		}
	}

}
