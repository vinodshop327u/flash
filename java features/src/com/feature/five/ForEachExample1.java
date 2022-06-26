package com.feature.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ForEachExample1 
{
	public static void main(String[] args) 
	{
		int total=0;
		Integer names[]= {1,2,3,5,61,73,12,34,45,6,78,9,56,89,455,78,13,23,90,11,8};
		//Arrays.sort(names);
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("i="+names[i]);
				}
			}
		}
		
		
		for(int d:names)
		{
			total++;
			System.out.print(d+"  ");
		}
		System.out.println("Total=  "+total);

		ArrayList<String> list=new ArrayList<String>();
		list.add(" asa");
		list.add("12");
		list.add("dsc");
		list.add("xc");
		list.add("ui");
		list.add("kl");
		
		System.out.println(list);
		
		for(String s:list)
		{
			System.out.print("  "+s);
		}
	}//main

}//class
