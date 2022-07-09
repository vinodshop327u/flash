package com.vinod.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sample_Hashset 
{
	public static void main(String[] args) 
	{
		int x=6;
		LinkedHashSet h=new LinkedHashSet(); //16
		for(int i=0;i<x;i++)
		{
			h.add(i);
		}
		h.add('q');
		//System.out.println(h);//[0, 1, 2, 3, 4, 5, q]
		h.add(null); //null insertion is possible
		//System.out.println(h);//[0, 1, 2, 3, 4, 5, q, null]
		TreeSet t=new TreeSet();
		t.add(new StringBuffer("hai"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("C"));
		System.out.println(t);
		
	}

}
