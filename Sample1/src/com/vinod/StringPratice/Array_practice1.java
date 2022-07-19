package com.vinod.StringPratice;

public class Array_practice1 
{
	public static void main(String[] args) 
	{
		int[] a= {10};
//step1
		System.out.println(a.length >= 2 &&(a[0] == 10 || a[a.length-1] == 10));
//step2
		if(a.length!=0 && a.length>=2)
		{
			if(a[0]==10 && a[a.length-1]==10)
			{
				System.out.println(true);
			}
			else
				System.out.println(false);
		}
		else
		{
			System.out.println("Array must be 2 numbers");
		}
	
		int[] num_array = {50,23,23};
		System.out.println(num_array.length >= 2 && num_array[0] ==  num_array[num_array.length-1]);
	
	}
}
