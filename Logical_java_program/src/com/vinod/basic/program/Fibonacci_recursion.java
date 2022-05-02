/*
 * 
 * Let's see the fibonacci series program in java using recursion.
 * 
 * 
 */



package com.vinod.basic.program;

public class Fibonacci_recursion
{
	static int n1=0,n2=1,n3=0;    
	static void printFibonacci(int count)
	{
		if(count>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" , "+ n3);
		}
	/*	else
		{
			System.exit(0);
		} */
		printFibonacci(count-1);
	}
	public static void main(String[] args)
	{
		int count=10;
		System.out.println();
		printFibonacci(count-2);
		
	}

}
