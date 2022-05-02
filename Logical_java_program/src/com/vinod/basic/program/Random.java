/*
 * 
 * Random numbers are the numbers that use a large set of numbers and selects a number using the mathematical algorithm. It satisfies the following two conditions:

The generated values uniformly distributed over a definite interval.
It is impossible to guess the future value based on current and past values.

Using the random() Method
Using the Random Class
Using the ThreadLocalRandom Class
Using the ints() Method (in Java 8)

 */
package com.vinod.basic.program;

import java.lang.Math;   

public class Random {

	public static void main(String[] args) 
	{
		System.out.println("1st Random Number: " + Math.random());   
		System.out.println("2nd Random Number: " + Math.random());  
		System.out.println("3rd Random Number: " + Math.random());   
		System.out.println("4th Random Number: " + Math.random());   
	}
}
