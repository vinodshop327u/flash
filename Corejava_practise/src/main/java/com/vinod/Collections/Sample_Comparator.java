package com.vinod.Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Sample_Comparator 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new mycomparator());
		t.add(20);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(10);
		System.out.println(t);//[20, 15, 10, 5, 0]
	}

}

class mycomparator implements Comparator
{
	public int compare(Object o1, Object o2) 
	{
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		//return i1.compareTo(i2);//[0, 5, 10, 15, 20]
		//return i2.compareTo(i1);//[20, 15, 10, 5, 0]
		//return -i1.compareTo(i2);//[20, 15, 10, 5, 0]
		//return -i2.compareTo(i1); //[0, 5, 10, 15, 20]
		//return -1;//[10, 5, 15, 0, 20]
		//return +1; //[20, 0, 15, 5, 10]
		return 0; //[20]
	}
}
