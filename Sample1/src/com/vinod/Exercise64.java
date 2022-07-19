package com.vinod;

import java.util.Scanner;

//Write a Java program that accepts two integer values between 
//25 to 75 and return true if there is a common digit in both numbers.
public class Exercise64 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        System.out.print("Input the first number : ");
	        int a = in.nextInt();  
			System.out.print("Input the second number: ");
			int b = in.nextInt(); 
			//System.out.println("Result: "+common_digit(a, b));
			System.out.println(inbuilt_modulus_operator(a, b));
			
			
	}
	
	public static int  inbuilt_modulus_operator(int a,int b)
	{
		int divided = a / b;
		int result = a - (divided * b);
		return result;
	}
	public static boolean common_digit(int p, int q)
    {  
	   if (p<25 || q>75)
		  
		   return false;
	   else
		   return true;
		 /* int x = p % 10; int y = q % 10; p /= 10; q /= 10;
		  System.out.println(p+"  "+q); return (p == q || p == y || x == q || x == y);*/
		 
    }
}
