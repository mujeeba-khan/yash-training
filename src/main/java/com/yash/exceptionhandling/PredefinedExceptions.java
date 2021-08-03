package com.yash.exceptionhandling;

public class PredefinedExceptions {

	public static void main(String[] args) {
		
		try
        {
            String s1=args[0];
            String s2=args[1];
            int n1=Integer.parseInt (s1);
            int n2=Integer.parseInt (s2);
            int n3=n1/n2;
            System.out.println ("div = "+n3);
            Object o = new Object();
            s1 = (String)o;
          //  Class.forName("com.mysql.jdbc.Driver"); // ClassNotFoundException: as its a checked exception 
            //compile time error will be shown
        }
        catch (ArithmeticException Ae)
        {
            System.out.println ("Can't divide by zero...");
        }
        catch (NumberFormatException Nfe)
        {
            System.out.println ("give only integer values...");
        }
        catch (ArrayIndexOutOfBoundsException Aioobe)
        {
            System.out.println ("enter values via command line...");
        }
		 catch (ClassCastException cce)
        {
            System.out.println ("Parent class cant be converted to its child type");
        }
        finally
        {
            System.out.println ("finalllllyyyy executed...");
        }
	}

}
