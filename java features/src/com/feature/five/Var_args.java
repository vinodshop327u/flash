package com.feature.five;

public class Var_args
{
	public void m1(String... s)
	{
		System.out.println("Hai!!!");
		for(String s1:s)
			System.out.print(s1+" ");
	}
	
	public static void main(String... args) 
	{
		new Var_args().m1("vinod");
		new Var_args().m1("vinod","Jasvin");
		new Var_args().m1("vinod","Jasvin","Dhatrija");
	} 
}
