/*
 * 
 * we will learn how to reverse a number in Java using while loop, for loop and recursion.
 * Reverse a number using while loop
Reverse a number using for loop
Reverse a number using recursion
 */

package com.vinod.Number.program;

public class Reverse_Number {

	public static int reverese_1(int number)
	{
		int reverse = 0;  
		while(number != 0)   
		{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}  
		return reverse;
	}

	public static int reverese_2(int number)
	{
		int reverse = 0;  
		//we have not mentioned the initialization part of the for loop  
		for( ;number != 0; number=number/10)   
		{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
		}  
		return reverse;
	}
	public static int reverese_3(int number)
	{
		if (number < 10)   
		{  
			//prints the same number if the number is less than 10  
			System.out.println(number);  
			return 0;  
		}  
		else   
		{  
			System.out.print(number % 10);  
			reverese_3(number/10);  
		}  
		return 1;
	}
	public static void main(String[] args) 
	{
		int rev1=reverese_1(987654);
		System.out.println("The reverse of the given number is: " + rev1);  

		int rev2=reverese_1(123456);
		System.out.println("The reverse of the given number is: " + rev2); 

		int rev3=reverese_3(456789);
		//System.out.println("The reverse of the given number is: " + rev3);  
	}

}
