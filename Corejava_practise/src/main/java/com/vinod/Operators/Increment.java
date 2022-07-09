package com.vinod.Operators;

public class Increment 
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=20;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(x);
		char c='z';
		System.out.println(++c);
		squr(16);
		int m=10,n=20;
		System.out.println(10==10.0);
		System.out.println();
		Thread t1=new Thread();
		Thread t2=new Thread();	
		Thread t3=t1;
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		System.out.println(t3 instanceof Thread);
		Increment r=null;
		System.out.println(r);
		System.out.println(t3 instanceof Runnable);
		System.out.println(!true);
		x=10;y=15;
		if(x==11 || y==12)
		{
			System.out.println("true+++++");
		}else
		{
			System.out.println("false+++++");
		}
		int a=30,b=20;
		x=(a>b)?40:50;
		System.out.println(x);
		x=(a>50)?777:((b>100)?50:999);
		System.out.println(x);
		
	}
	public static void squr(double d)
	{
		System.out.println(Math.sqrt(d));
	}

}
