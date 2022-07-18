package com.features.eight;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapStream1 
{
	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		Function<Integer,Integer> function=new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t*t;
			}
		};	
		list.stream()
		.map(function)
		.forEach(System.out::println);
		
		Function<Integer, Integer> function1=(t)->{ return t*t; };
		Function<Integer, Integer> function2=(t)->  t*t; 
		
		list.stream()
		.map(function2)
		.forEach(System.out::println);
		
		list.stream()
		.map(t->{
			return t+ " :a";
		}).forEach(System.out::println);
	}
 
}
