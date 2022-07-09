package com.vinod.multiThread;

public class sample_synchronized2 
{
	public static void main(String[] args) 
	{
		Mythread10 t=new Mythread10();
		t.setDaemon(true);//---------------->1
		t.start();
		System.out.println("End of main");

	}

}
class Mythread10 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Lazy Thread..");
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
