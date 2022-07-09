package com.vinod.LanguageFundamentals;

public class Staticvariable 
{
	static int s=10;
	
	public static void main(String[] args) 
	{
		s=20;
		System.out.println(s);	
		new Staticvariable().m1();
		s=40;
		new Staticvariable().m1();
		
	}
	public static void m1()
	{
		int d=20;
		System.out.println(d);	
		System.out.println(s);
	}
}
