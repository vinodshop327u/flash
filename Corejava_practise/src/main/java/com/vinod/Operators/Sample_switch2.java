package com.vinod.Operators;

public class Sample_switch2 
{
	public static void main(String[] args) 
	{
		int x=0;
		do
		{
			x++;
			if(x<105)
			{
				if(x%3==0)
				{
					System.out.println(x);
				}
			}
			
		}while(x<100);
	}

}
