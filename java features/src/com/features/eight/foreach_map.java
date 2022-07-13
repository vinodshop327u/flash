package com.features.eight;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class foreach_map 
{
	private static final String String = null;

	public static void main(String[] args) 
	{
		Map<String,String> m=new HashMap<>();
		m.put("A","vinod");
		m.put("B","sai");
		m.put("B","Jasvin");
		m.put("D","siva");
		m.put("E","dhatri");
		
		m.forEach((k,v)->{
			System.out.println(k+"  "+v);
		});
		
		BiConsumer<String,String> consumer=	new BiConsumer<String, String>() {
			public void accept(String t, String u) {
				// TODO Auto-generated method stub
				System.out.println(t+"   "+u);
			}		};		
		m.forEach(consumer);
	
	
	
	}

}
