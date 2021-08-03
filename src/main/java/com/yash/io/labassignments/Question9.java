package com.yash.io.labassignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Question9 {

	public static void main(String[] args) throws Exception {
		
		File f = new File("E:\\Java Yash training");
		try 
		{
			if(f.exists())
			{
				if(f.isDirectory())
				{
					String files[] = f.list();
					for(int i=0;i<files.length;i++)
					{
						//System.out.println("Text files: "+files[i].e)
						if(files[i].endsWith(".txt"))
						{
							FileInputStream fis = new FileInputStream("E:\\Java Yash training\\"+files[i]); 
							int k;
							while((k=fis.read())!=-1)
								System.out.print((char)k);

							FileOutputStream fos = new FileOutputStream("E:\\Java Yash training\\"+files[i]);
							String s = "Hello people...Its raining too much out there..and I am from File Output Stream..";
							byte b[] = s.getBytes();
							fos.write(b);

							break;
						}
					}
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
