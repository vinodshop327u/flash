package com.vinod.Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Sample_Comparator1 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new mycomparator1());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add(new StringBuffer("ZZ"));
		t.add("XX");
		t.add("ABCD");
		System.out.println(t);//[A, AA, XX, ZZ, ABC, ABCD]
	}
}
class mycomparator1 implements Comparator
{

	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		
		int l1=s1.length();
		int l2=s2.length();
		
		if(l1<l2)
			return -1;
		else if (l1>l2) {
			return +1;
		}else
			return s1.compareTo(s2);
			//return 0;
	}
	
}
