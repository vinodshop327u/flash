package com.vinod;

public class Odd_even_print 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			System.out.println("Even="+i); 
			else if(i%2!=0)
				System.out.println("Odd="+i);
		}
		
	}

}
