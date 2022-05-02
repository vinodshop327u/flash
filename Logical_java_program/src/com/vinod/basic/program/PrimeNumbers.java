/*
 *Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, 
 *prime numbers can't be divided by other numbers than itself or 1. 
 * 
 *  For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 * 
 */
package com.vinod.basic.program;

public class PrimeNumbers {

	public static void main(String[] args) 
	{
		int i,m=0,flag=0;      
		  int n=149;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number If");      
		  }else{  
		   for(i=2;i<=m;i++){ 
			  // System.out.println(" i = "+i);
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
	}

}
