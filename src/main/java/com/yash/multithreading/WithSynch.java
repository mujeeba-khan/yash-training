package com.yash.multithreading;

class NewTable
{  
	synchronized void printTable(int n) // synchronized method
	//void printTable(int n)
	{ 
		for(int i=1;i<=10;i++)
		{  
			System.out.println(n*i);  
			try{  
				Thread.sleep(400);  
			}catch(Exception e)
			{
				e.printStackTrace();
			}  
		} 
		System.out.println();

	}  
} 

class NewThread1 extends Thread
{  
	NewTable t;  
	NewThread1(NewTable t)
	{  
		this.t=t;  
	}  
	public void run()
	{  
		/*
		synchronized(t) // synchronized block
		{
			t.printTable(5);
		}*/
		
		t.printTable(5);  
	}  
}


class NewThread2 extends Thread
{  
	NewTable t;  
	NewThread2(NewTable t){  
		this.t=t;  
	}  
	public void run()
	{  
		/*synchronized(t) // synchronized block
		{
			t.printTable(15);
		}*/
		
		t.printTable(15);  
	}  
}


public class WithSynch
{

	public static void main(String[] args) 
	{

		NewTable obj = new NewTable();
		
		NewThread1 t1=new NewThread1(obj);  
		NewThread2 t2=new NewThread2(obj);  
		
		t1.start();  
		t2.start();

	}

}

