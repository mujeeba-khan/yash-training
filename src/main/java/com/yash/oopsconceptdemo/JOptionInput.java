package com.yash.oopsconceptdemo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionInput {
	
	JOptionInput()
	{
		JFrame f = new JFrame();
		String name = JOptionPane.showInputDialog("Enter name");
		System.out.println("Your name: "+name);
	}
	
	public static void main(String args[])
	{
		new JOptionInput();
	}

}
