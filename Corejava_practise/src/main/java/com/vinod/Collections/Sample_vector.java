package com.vinod.Collections;

import java.util.Vector;

public class Sample_vector 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		System.out.println(v.capacity());
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		v.remove(1);
		System.out.println(v);
		
		System.out.println(v.capacity());
		
		
		
	}

}
