package com.vinod.Collections;

import java.util.TreeSet;

public class Sample_Navigableset1
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(100);
		t.add(200);
		t.add(300);
		t.add(400);
		t.add(250);
		System.out.println(t);//[100, 200, 250, 300, 400]
		System.out.println(t.ceiling(250));//250
		System.out.println(t.higher(300));//400
		System.out.println(t.floor(299));//250
		System.out.println(t.lower(249));//200
		System.out.println(t);//[100, 200, 250, 300, 400]
		System.out.println(t.pollFirst());//100 remove
		System.out.println(t.pollLast());// 400 remove
		System.out.println(t.descendingSet());//[300, 250, 200]
	}

}
