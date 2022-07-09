package com.vinod.ExceptionHandling;

public class Sample_Exception1 
{
	public static void main(String[] args)  
	{
		try
		{
			Thread.sleep(2000);
			System.out.println("SSS");
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}		
		
		//throw new ArithmeticException("hai");//java.lang.ArithmeticException: hai
		/*
		 * try { throw new ArithmeticException("hai");
		 * 
		 * }catch(ArithmeticException e){ System.out.println(10/2); } //finally{
		 * System.out.println(12/2); }
		 */		
		//System.out.println("hai");
