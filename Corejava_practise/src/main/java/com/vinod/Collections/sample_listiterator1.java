package com.vinod.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class sample_listiterator1 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("jasvin");
		al.add("vinod");
		al.add("dhatrija");
		al.add("chiru");
		al.add("balakrishna");
		System.out.println(al);//[jasvin, vinod, dhatrija, chiru, balakrishna]
		ListIterator it=al.listIterator();
		while(it.hasNext())
		{
			String st=(String)it.next();
			if(st.equals("Jasvin"))
			{
				it.remove();
			}
			if(st.equals("vinod"))
			{
				it.set("subbarao");
			}
			System.out.println(al);
		}
		
	}
}
