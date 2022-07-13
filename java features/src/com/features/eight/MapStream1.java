package com.features.eight;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapStream1 
{
	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,56,90);
		Function<Integer,Integer> function=new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				
				return t*t;
			}
		};	
		list.stream()
		.map(function);
		
	}

}
