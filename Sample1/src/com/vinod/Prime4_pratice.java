package com.vinod;

public class Prime4_pratice 
{
	public static void main(String[] args) 
	{
		int sum=1,ctr=0,n=0;
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
		}
		System.out.println("sum= "+sum);		
		
	}//main
	
	public static boolean is_prime(int n)
	{
		for(int i=3;i*i<=n;i+=2)
		{
			if(n%i==0) 
			{
				return false;
			}
		}
		return true;
	}
}
