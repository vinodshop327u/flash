package com.vinod.ExceptionHandling;

public class Test1 {

	public static void main(String[] args) throws InterruptedException
	{
		dostuff();
	}
	public static void dostuff()throws InterruptedException
	{
		dostufff();	
	}
	public static void dostufff()throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Hai!!!!!!!!");
	}
}
