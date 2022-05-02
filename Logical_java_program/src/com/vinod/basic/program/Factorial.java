/*
 * : Factorial of n is the product of all positive descending integers. 
 * Factorial of n is denoted by n!. For example:
 * 
 * 4! = 4*3*2*1 = 24  
5! = 5*4*3*2*1 = 120  
 * 
 */
package com.vinod.basic.program;

public class Factorial 
{
	public static void main(String[] args) 
	{
		 int i,fact=1;  
		  int number=6;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		
	}

}
