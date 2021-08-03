package com.yash.io;

import java.io.*;

public class DataStreams {

	public static void main(String[] args) {

		DataOutputStream dos;
		try {
			
			dos = new DataOutputStream(new FileOutputStream("E:\\Java Yash training\\Writefile.txt"));
			dos.writeUTF("This is my string data");
			dos.writeChar('A');
			dos.writeInt(0);
			dos.writeDouble(23.5);
			
			DataInputStream dis = new DataInputStream(new FileInputStream("E:\\Java Yash training\\Writefile.txt"));
			
			while(dis.available()>0)
			{
				System.out.println(dis.readUTF()+"\n"+dis.readInt()+"\n"+dis.readChar()+"\n"+dis.readDouble());
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
