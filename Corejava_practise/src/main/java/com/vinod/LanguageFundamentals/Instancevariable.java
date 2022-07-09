package com.vinod.LanguageFundamentals;

public class Instancevariable 
{
	int x=10;
	public static void main(String[] args) 
	{
		new Instancevariable().m1();
	}
	
	public void m1()
	{
		int x=20;
		int y=10;
		String s="vinod";
		System.out.println(x+"   "+y+"  "+new Instancevariable().x);
	}
}


