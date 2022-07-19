package com.vinod;

import java.util.Scanner;

public class swapvariables 
{
	public static void main(String[] args) 
	{
		int a=1220;
		int b=2980;
		System.out.println(a+"   "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+"   "+b);
		
		String[] arra=new String[10];
		  arra[0] = " +\"\"\"\"\"+ ";
		  arra[1] = "[| o o |]";
		  arra[2] = " |  ^  |";
		  arra[3] = " | '-' |";
		  arra[4] = " +-----+";
		  int i=5;
		  for(i=0;i<5;i++)
		  System.out.println(arra[i]);
		
		  System.out.println("\nJava Version: "+System.getProperty("java.version"));
		    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
		    System.out.println("Java Home: "+System.getProperty("java.home"));
		    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
		    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
		    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"/src");
		  
		    Scanner input = new Scanner(System.in);
	        int number1; // first number to compare       
	        int number2; // second number to compare  
	      
//	        System.out.print( "Input first integer: " ); // prompt        
//	        number1 = input.nextInt(); // read first number from user   
//	 
//	        System.out.print( "Input second integer: " ); // prompt        
//	        number2 = input.nextInt(); // read second number from user               
//	        
//	        if ( number1 == number2 )           
//	            System.out.printf( "%d == %d\n", number1, number2 );  
//	        if ( number1 != number2 )          
//	            System.out.printf( "%d != %d\n", number1, number2 );  
//	        if ( number1 < number2 )          
//	            System.out.printf( "%d < %d\n", number1, number2 );  
//	        if ( number1 > number2 )          
//	            System.out.printf( "%d > %d\n", number1, number2 );  
//	        if ( number1 <= number2 )          
//	            System.out.printf( "%d <= %d\n", number1, number2 );  
//	        if ( number1 >= number2 )          
//	            System.out.printf( "%d >= %d\n", number1, number2 );
//	        	System.out.printf("%d  %d",number2,number1+"\n");
	        	
	        	float f1=10f;
	        	float f2=20f;
	        	System.out.printf("%.2f",f1);
	        	
	        	 Scanner input1 = new Scanner(System.in);
	             System.out.print("Input an integer: ");
	             long n = input1.nextLong();
	             System.out.println("The sum of the digits is: " + sumDigits(n));

	         }

	         public static int sumDigits(long n) {
	             int sum = 0;
	             while (n != 0) {
	                 sum += n % 10;
	                 n /= 10;
	                 System.out.println();
	             }
	             return sum;
	}

}

