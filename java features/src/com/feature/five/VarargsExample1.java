package com.feature.five;



public class VarargsExample1 
{
	
	static public void display(String... values )
	{
		for(String s:values)
			
		System.out.print(s);
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		display("hai");
		display("hai"," my name ");
		display("hai"," my name "," is vinod");
		display("hai"," my name "," is vinod"," asas");
	}

}
