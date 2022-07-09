package com.vinod.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Sample_hashmap1 
{
	public static void main(String[] args) 
	{
		LinkedHashMap  m=new LinkedHashMap ();
		m.put("Chiru",700);
		m.put("Bala krishna",600);
		m.put("Venky",500);
		m.put("nag",300);
		//System.out.println(m);//{nag=300, Chiru=700, Venky=500, Bala krishna=600}
		m.put("Chiru",1000);
		//System.out.println(m);//{nag=300, Chiru=1000, Venky=500, Bala krishna=600}
		Set s=m.keySet();
		//System.out.println(s);//[nag, Chiru, Venky, Bala krishna]
		Collection c=m.values();
		//System.out.println(c);//[300, 1000, 500, 600]
		Set s1=m.entrySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			//System.out.println(m1.getKey()+"      "+m1.getValue());
			if(m1.getKey().equals("Chiru"))
			{
				m1.setValue(999);
			}
			//System.out.println(m);//{nag=300, Chiru=999, Venky=500, Bala krishna=600}
		}			
		HashMap m1=new HashMap();
		m1.put("Chiru",700);
		m1.put("Bala krishna",600);
		m1.put("Venky",500);
		m1.put("nag",300);
		System.out.println(m1);//{nag=300, Chiru=700, Venky=500, Bala krishna=600}
		
		HashMap m2=new HashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		m2.put(i1,"vinod");
		m2.put(i2,"saaa");
		System.out.println(m2);//{10=saaa}
		
		IdentityHashMap m3=new IdentityHashMap();
		Integer i4=new Integer(10);
		Integer i5=new Integer(10);
		m3.put(i4,"vinod");
		m3.put(i5,"saaa");
		System.out.println(m3);//{10=vinod, 10=saaa}
	
	}		}
