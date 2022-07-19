package com.vinod;

import java.util.Scanner;

//Print hello and your name on a separate lines
public class Excercise1 {

	public static void main(String[] args) {
		//System.out.println("Hello \n Alexandra Abramov!");
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter id");
//		int a=sc.nextInt();
//		System.out.println("Enter name");
//		String b=sc.next();
//		System.out.println(a+"   "+b);
//		System.out.println("Enter first number");
//		int a1=sc.nextInt();
//		System.out.println("Enter Second number");
//		int a2=sc.nextInt();
//		int sum=a1+a2;
//		float divide=a1/a2;
//		System.out.println(sum);
//		System.out.println(divide);
		//System.out.println(-5+8*6);
		//System.out.println("Input first number");
		//int a1=sc.nextInt();
		
		//System.out.println("Input Second number");
		//int a2=sc.nextInt();
		//System.out.println(a1+"+"+a2+"="+(a1+a2));
//		System.out.println("Input a number");
//		int a1=sc.nextInt();
//		for(int i=0;i<10;i++)
//		{
//			System.out.println(a1*i);
//		}
		//System.out.println(2*Math.PI*7.5);
		System.out.println(1+2+3+4+5/5);
		
		final double width = 5.6;
        final double height = 8.5;

        double perimeter = 2*(height + width);
		
        double area = width * height;			
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.5f \n", height, width, perimeter);
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
        System.out.printf("asas %.1f %.2f %.3f ",width,height,area);
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
         System.out.println(p1);
        }
        
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
         System.out.println(p2);
        }
        
	}

}
