package com.yash.multithreading;


public class ThreadExample extends Thread
{
	public void run()
	{
		try {
			System.out.println("Welcome to thread - Id : "+Thread.currentThread().getId());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
    public static void main( String[] args )
    {
        ThreadExample th = new ThreadExample();
        th.start();
        
        for(int i=0;i<5;i++)
        {
        	 ThreadExample th1 = new ThreadExample();
             th1.start();
        }
    }
}
