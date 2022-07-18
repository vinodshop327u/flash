package com.features.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatmapExample1 
{
	public static void main(String[] args) 
	{
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list1.add(3);
		list1.add(4);
		
		
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list1.add(5);
		list1.add(6);
		
		list.add(list1);
		list.add(list2);
		list.add(list3);
		
		
		list.stream().flatMap(x->x.stream()).forEach(System.out::println);
		//list.stream().flatMap(x->x.stream().filter(p->p.equals(1))).forEach(System.out::println);
		
		List<Integer> list5 = Arrays.asList(12, 45, 67, 19, 87, 2, 9);  
		//creating a new stream of the elements an prints the same using the foreach loop  
		list5.stream().map(number -> number * 2).forEach(System.out::println); 
	
	}

}
