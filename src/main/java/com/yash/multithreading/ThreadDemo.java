package com.yash.multithreading;

public class ThreadDemo implements Runnable
{

	@Override
	public void run() 
	{
		try 
		{
			System.out.println("Welcome to thread - Id : "+Thread.currentThread().getId()
					+"\nName : "+Thread.currentThread().getName()
					+"\nPriority: "+Thread.currentThread().getPriority()
					+"\nThread is ALive: "+Thread.currentThread().isAlive()+"\n"
					);
					
			System.out.println("\nNew name of thread: "+Thread.currentThread().getName()+"\n");
			// get the new name set by setName()
			
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000); // pause the execution for 1000 ms then again resume
			}
			System.out.println("");
			
			 // Waits for 1000ms or this thread to die.
	        Thread.currentThread().join(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		ThreadDemo r = new ThreadDemo();
		
		Thread t = new Thread(r); // passing the Runnable to Thread object
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t.setName("First Thread");
		t1.setName("Second Thread");
		t2.setName("Third Thread");
		
		
		
		t.start(); // starting the thread execution
		t1.start();
		t2.start();
		
		t.stop(); //stops the execution of thread
		
		t1.join(1000);
		
		System.out.println("First Thread is alive: "+t.isAlive()+"\n"); // thread t is dead now
		
		//wait(), notify() are mainly used with synchronization
		//The wait() method causes the current thread to wait until 
		//another thread invokes the notify() or notifyAll() methods for that object.


	}

}
