package com.vinod.javafeatures18;


interface vehical
{
	//public void byke();
	//public void car();
	public int zeep();
	//public String loory();
	//public String motercycle();

	
}
public class Lambda1 
{
	public static void main(String[] args) 
	{
		
		/*
		 * vehical v1=()->{System.out.println("vehical name is car"); }; v1.car();
		 */
		vehical v2=()->{ System.out.println("hai");
		return 10;};
		v2.zeep();
		
		
		
	}
}
