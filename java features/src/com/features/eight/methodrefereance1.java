package com.features.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
interface Test
{
	public void said(Integer i);
}

public class methodrefereance1 
{
	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<Integer>();		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		methodrefereance1 mr1=new methodrefereance1();
		Consumer<Integer> customer1=(i)->
		{
			//System.out.println("hi= "+i);
			m1(i);//we can inside method call
		};
		//list.forEach(customer1);	
		
		Test t1=mr1::m3;
		//Consumer<Integer> cust1=mr1::m2;
		Consumer<Integer> customer2=mr1::m2;
		{
			//System.out.println("hi= "+i);
			m1(1);//we can inside method call
		};
		list.forEach(customer2);
				
	} 

	public static void m1(Integer s1)
	{
		//System.out.println(s1);
	}
	public void m2(Integer s2)
	{
		//System.out.println(s2);
	}
	public void m3(Integer s2)
	{
		System.out.println(s2);
	}

}
