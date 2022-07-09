package com.vinod.Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SampleNavagibleMap1 
{
	public static void main(String[] args) 
	{
		TreeMap t=new TreeMap();
		t.put("a", "Apple");
		t.put("b","Bannana");
		t.put("c","Cat");
		t.put("d","dog");
		t.put("e","elephant");
		t.put("f","frog");
		t.put("g","gun");
		System.out.println(t);//{a=Apple, b=Bannana, c=Cat, d=dog, e=elephant, f=frog, g=gun}
		System.out.println(t.ceilingKey("a"));//a
		System.out.println(t.higherKey("c")); //d
		System.out.println(t.floorKey("f"));//e
		System.out.println(t.lowerKey("c"));//b
		System.out.println(t.pollFirstEntry());//a=Apple
		System.out.println(t.pollLastEntry());//g=gun
		System.out.println(t.descendingKeySet());//[f, e, d, c, b]
		System.out.println(t.descendingMap());//{f=frog, e=elephant, d=dog, c=Cat, b=Bannana}
		
		
		Set s1=t.keySet();
		//System.out.println(s1);
		Collection c=t.values();
		//System.out.println(c);
		Set s2=t.entrySet();
		Iterator it=s2.iterator();
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();
			//System.out.println(mp.getKey()+"    "+mp.getValue());
		}
	}

}
