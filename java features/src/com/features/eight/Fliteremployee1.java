package com.features.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fliteremployee1 
{
	public static void main(String[] args) 
	{	
		List<String> list= new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");	
		list.add("A");	
	
	//	list.stream()
	//	.filter(x->x.equalsIgnoreCase("A"))
	//	.collect(Collectors.toList())
	//	.forEach(System.out::println);
		
		List list1=Arrays.asList(1,2,3,4,1,2,3,6,7,8,9,4,5,6,7,8,9);
		Stream<Integer> stream1= list1.stream();
//		List<Integer> listback = stream1.collect(Collectors.toList());
//		//listback.forEach(System.out::println);
		
		Set<Integer> setback = stream1.collect(Collectors.toSet());
		setback.forEach(System.out::println);
		
		List<String> liststr=Arrays.asList("1","2","3","4","5","6","7");
		String Stringback = liststr.stream().collect(Collectors.joining(":","[","]"));
		System.out.println(Stringback);
		
	}

	private static Stream<Integer> Collect(Collector<Object, ?, List<Object>> list) {
		// TODO Auto-generated method stub
		return null;
	} 
	

}
