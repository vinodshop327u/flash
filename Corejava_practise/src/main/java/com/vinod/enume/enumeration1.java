package com.vinod.enume;


public class enumeration1 
{
	public enum Season { WINTER, SPRING, SUMMER, FALL }  
	  //creating the main method  
public static void main(String[] args) {
	

	  //printing all enum  
	  for (Season s : Season.values()){  
	  System.out.println(s);  
	  }  
	  System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
	  System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());//0  
	  System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());//2
}
}