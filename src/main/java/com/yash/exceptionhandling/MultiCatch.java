package com.yash.exceptionhandling;

public class MultiCatch {

	public static void main(String[] args) {
		
		try
        {
            String s1=args[0];
            String s2=args[1];
            int n1=Integer.parseInt (s1);
            int n2=Integer.parseInt (s2);
            int n3=n1/n2;
            System.out.println ("div = "+n3);

        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) // cant write parent exception with child 
        {
            System.out.println ("Oops something went wrong..");
        }

	}

}
