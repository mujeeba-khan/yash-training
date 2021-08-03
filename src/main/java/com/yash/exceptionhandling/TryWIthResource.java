package com.yash.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWIthResource {

	public static void main(String[] args) throws FileNotFoundException {

		
		try(FileOutputStream fos = new FileOutputStream("textfile.txt");)
		{
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
