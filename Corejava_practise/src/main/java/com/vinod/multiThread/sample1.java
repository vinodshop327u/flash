package com.vinod.multiThread;

public class sample1 {
	public static void main(String[] args) 
	{
		Mythread t=new Mythread();
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main Thread");
		}
		
	}
}

class Mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
