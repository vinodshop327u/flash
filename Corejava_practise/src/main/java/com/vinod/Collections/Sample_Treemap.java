package com.vinod.Collections;

import java.util.Comparator;
import java.util.TreeMap;

public class Sample_Treemap 
{
	public static void main(String[] args) 
	{
		TreeMap t=new TreeMap(new Mycomparator16());
		t.put(100,"ZZZ");
		t.put(200,"AAA");
		t.put(300,"BBB");
		t.put(400,"CCC");
		t.put(500,106);
		t.remove(100);//remove 100 key
		t.put(600,'s');
		System.out.println(t);//{200=AAA, 300=BBB, 400=CCC, 500=106, 600=s}
		//t.put("fff",10);//CCE
		//t.put(null,3);//java.lang.NullPointerException
		
	}
}
class Mycomparator16 implements Comparator
{

	public int compare(Object o1, Object o2) {
		String s1=o1.toString(); 
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}

