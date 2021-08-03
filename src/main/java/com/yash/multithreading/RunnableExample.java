package com.yash.multithreading;

public class RunnableExample implements Runnable
{

	public static void main(String[] args) {
		
		RunnableExample r = new RunnableExample();
		Thread t = new Thread(r);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t.start();
		t1.start();
		t2.start();

	}

	@Override
	public void run() {

		try {
			System.out.println("Welcome to thread - Id : "+Thread.currentThread().getId());
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
