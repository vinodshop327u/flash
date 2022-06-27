package com.feature.five;

public class EnumExample1 
{
	public enum Season { WINTER, SPRING, SUMMER, FALL }  
	
	public static void main(String[] args) 
	{
		for (Season s : Season.values()){  
			System.out.println(s);  
			}  
			System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
			System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());  
			System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());  
			System.out.println("Index of FALL is: "+Season.valueOf("FALL").ordinal()); 
		
	}

}
