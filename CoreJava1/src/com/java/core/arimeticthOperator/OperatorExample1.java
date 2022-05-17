package com.java.core.arimeticthOperator;

public class OperatorExample1 
{
	public static void main(String[] args) 
	{
		int a=10;  
		int b=15;  
		int c=20;  
		System.out.println(a>b||a<c);//true || true = true  
		System.out.println(a>b|a<c);//true | true = true  
		//|| vs |  
		System.out.println(a>b||a++<c);//true || true = true  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a>b|a++<c);//true | true = true  
		System.out.println(a);//11 because second condition is checked  
		
	}

}
