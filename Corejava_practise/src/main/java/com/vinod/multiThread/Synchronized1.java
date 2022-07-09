package com.vinod.multiThread;

public class Synchronized1
{
	public static void main(String[] args) {
		display d=new display();
		Mythread1 t1=new Mythread1(d, "Vinod");
		Mythread1 t2=new Mythread1(d, "Jasvin");
		t1.start();
		t2.start();
	}

}

class display
{
	public  void wish(String name)
	{
		synchronized(this)
		{		
			for(int i=0;i<=5;i++)
			{
				System.out.println("Good Morning!!"+i+"  "+name);
			
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}	}	}		}
}
class Mythread1 extends Thread
{
	display d;
	String name;
	public Mythread1(display d,String name) {
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
