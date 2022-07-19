package com.vinod;

public class prime3 
{
	public static void main(String[] args) {

		int sum=1; int n=0; int ctr=0;

		while(ctr<100)
		{
			n++;
			if(n%2!=0)
			{
				if(is_prime(n))
				{
					//System.out.println(n);
					sum+=n;
				}
			}
			ctr++;
		}//while
			System.out.println("Sum of prime values 100"+sum);
	}//main

	public static boolean is_prime(int n)
	{
		
		for(int i=3;i*i<=n;i+=2)
		{
			System.out.println("if condiction="+n%i+" n= "+n+"  i= "+i);
			if(n % i==0)
			{
				return false;
			}
		}
		
		return true;
	}


}//class
