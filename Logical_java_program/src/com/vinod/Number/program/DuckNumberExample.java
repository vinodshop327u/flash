/*
 * 
 * 3210 is a Duck number because it contains zero at the end of the number but not present at the beginning of it.
08237 is not a Duck number because it contains zero at the beginning of it.
7033 is a Duck number because it contains zero at the second position, not at the beginning.
 */


package com.vinod.Number.program;

import java.util.Scanner;

public class DuckNumberExample 
{
	// create checkNumber() method that returns true when it founds number Buzz   
	public static boolean checkNumber(int number) {  

		// use loop to repeat steps  
		while(number != 0) {  

			// check whether the last digit of the number is zero or not  
			if(number%10 == 0)  
				return true;    //return true if the number is Duck  

			// divide the number by 10 to remove the last digit  
			number = number / 10;  
		}  

		return false; //return false if the number is not Duck  
	}  
	// main() method start  
	public static void main(String args[])   
	{     
		int n1, n2;  

		//create scanner class object to get input from user  
		Scanner sc=new Scanner(System.in);  

		//show custom message  
		System.out.println("Enter first number");  

		//store user entered value into variable n1  
		n1 = sc.nextInt();  

		//show custom message  
		System.out.println("Enter second number");  

		//store user entered value into variable n2  
		n2 = sc.nextInt();  

		if (checkNumber(n1))   
			System.out.println(n1 + " is a Duck number");   
		else  
			System.out.println(n1 + " is not a Duck number");   
		if (checkNumber(n2))   
			System.out.println(n2 + " is a Duck number");   
		else  
			System.out.println(n2 + " is not a Duck number");   
	}  

}
