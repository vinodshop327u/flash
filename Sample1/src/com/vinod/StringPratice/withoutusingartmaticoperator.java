package com.vinod.StringPratice;

import java.util.Scanner;

public class withoutusingartmaticoperator 
{
	public static void main(String[] args) {

		//int x, y ;
		//		   Scanner in = new Scanner(System.in);	
		//		   System.out.print("Input first number: ");
		//		   x = in.nextInt(); 
		//		   System.out.print("Input second number: ");
		//		   y = in.nextInt(); 
		//	      while(y != 0){
		//	            int carry = x & y;
		//	            System.out.println(carry);
		//	            x = x ^ y;
		//	            System.out.println(x+" "+y);
		//	            y = carry << 1;
		//	            System.out.println(y);
		//	        }
		//	        System.out.print("Sum: "+x); 
		//			System.out.print("\n"); 

		int num1 = 10, num2 = 15, i;
		while (num2 > 0) {
			num1++;
			num2--;				   }
		// System.out.println(num1);

		for (i = 0; i <num2; i++)
			num1++;
		//System.out.println(num1);

		int p=151;
		boolean q=is_Palindrome(p);
		System.out.println(q);

	}//main method				
	public static int reverse_nums(int n) {
		int reverse = 0;
		while (n != 0) {
			reverse *= 10;
			System.out.println(reverse);
			reverse += n % 10;
			System.out.println(reverse);
			n /= 10;
			System.out.println(n);
		}
		return reverse;
	}
	public static boolean is_Palindrome(int n) {
		return (n == reverse_nums(n));
	}
}//class

