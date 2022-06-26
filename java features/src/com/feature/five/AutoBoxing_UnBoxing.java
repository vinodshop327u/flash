package com.feature.five;

public class AutoBoxing_UnBoxing 
{
	
	static void m(int i){System.out.println("int");}  
	static void m(Integer i){System.out.println("Integer");}  
	  
	public static void main(String[] args) 
	{
		 short s=30;  
		   m(s);  		
	}

}
