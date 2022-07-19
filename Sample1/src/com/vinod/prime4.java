package com.vinod;

public class prime4 
{
	public static void main(String[] args) 
	{
		int i =0,num =0;
		//Empty String
		String  primeNumbers = "";

		for (i = 1; i <= 100; i++)         
		{ 		  	  
			int counter=0; 	  
			for(num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}//for num
			System.out.println(counter+"  i="+i);
			if (counter ==2)
			{
				//Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}//if	
		}//for i	
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);

	}  

}
