package com.feature.five;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
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
		Lombak_sample ls=new Lombak_sample();
		System.out.println(ls);
		new Var_args().m1("vinod");
		new Var_args().m1("vinod","Jasvin");
		new Var_args().m1("vinod","Jasvin","Dhatrija");
	} 
}
