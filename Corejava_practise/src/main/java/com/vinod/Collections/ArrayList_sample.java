package com.vinod.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList_sample 
{
	public static void main(String[] args) {
		/*
		 * ArrayList al=new ArrayList(); al.add(10); al.add(12); al.add('1');
		 * System.out.println(al);
		 */
		
		ArrayList al=new ArrayList(10);
		al.add(20);
		al.add(12);
		al.add(10);
		al.add(30);
		al.add(50);
		System.out.println(al);//[20, 12, 10, 30, 50]
		
		
		
		
		
		Collections.sort(al);
		System.out.println(al);//[10, 12, 20, 30, 50]
		System.out.println(Collections.binarySearch(al,30));//3
		Collections.reverse(al);
		System.out.println(al);//[50, 30, 20, 12, 10]
		Collections.reverseOrder();
		
		
		ArrayList a=new ArrayList(al);
		//a.add(10);
		//a.set(1, 20);//5)	Object set(int index,Object new) 
		//a.remove(1);//3)	Object remove(int index)
		//a.add(2,100);//1)	boolean add(int index,Object o)
		//System.out.println(a.get(0));//4)	Object get(int index)
	
		//a.lastIndexOf(al);
		//System.out.println(al);
		//Collections.sort(al);
		//System.out.println(al);
		
		 int[] arr= {10,5,32,56,87,96,15};
		 for(int a2:arr)
		 {
			 System.out.print(a2+"  ");
		 }
		 Arrays.sort(arr);
		 System.out.println();
		 for(int a2:arr)
		 {
			 System.out.print(a2+"  ");
		 }
		
		
	}

}
