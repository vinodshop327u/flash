package com.feature.five;

public class AutoBoxing_UnBoxing 
{
	
	static void m(int i){System.out.println("int");}  
	static void m(Integer i){System.out.println("Integer");}  
	static void m(Double i){System.out.println("Double");}
	static void m(double i){System.out.println("double");}
	static void m(int i, int i2){System.out.println("int int");}  
	static void m(Integer... i){System.out.println("Integer...");}  
	public static void main(String[] args) 
	{
		 double s=30.23;  
		  m(s);  		
		   short s1=10,s2=20;
		   m(s1,s2);
	}

}
