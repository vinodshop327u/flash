package com.vinod.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class sample_iterator1 
{
	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		for(int i=0;i<10;i++)
			{
				h.add(i);
			}
		System.out.println(h);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		Iterator it=h.iterator();
		while(it.hasNext())
		{
			Integer i=(Integer)it.next();
			if(i%2==0)
			{
				System.out.println(i);//0 2  4  6  8
			}else
			{
				it.remove();
			}
		}//while
		System.out.println(h);
	}

}
