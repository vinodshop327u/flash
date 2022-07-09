package com.vinod.Collections;

import java.util.LinkedList;

public class Sample_linkedlist 
{
	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add("durga");
		l.add(12);
		l.add(56);
		l.add(76);
		l.set(2, "jasvin");
		//l.remove(2);
		l.removeLast();
		l.addFirst('s');
		l.add("vinod");
		System.out.println(l);
	}

}
