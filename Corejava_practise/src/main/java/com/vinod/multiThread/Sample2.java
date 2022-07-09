package com.vinod.multiThread;

public class Sample2 
{
	public static void main(String[] args) 
	{
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		t.interrupt();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main thread");
		}
		
	}
}
class MyRunnable implements Runnable
{

	public void run() {
		try {
		for(int i=0;i<=10;i++)
		{
			Thread.sleep(500);
			System.out.println("Child thread");
			
		}
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("i got interruped");
		}
		
	}
	
}
