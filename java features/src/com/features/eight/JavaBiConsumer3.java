package com.features.eight;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class JavaBiConsumer3 
{
	public static void main(String[] args) 
	{
			math(1, 1, (x, y) -> System.out.println(x + y));   // 2
	        math(1, 1, (x, y) -> System.out.println(x - y));   // 0
	        math(1, 1, (x, y) -> System.out.println(x * y));   // 1
	        math(1, 1, (x, y) -> System.out.println(x / y));   // 1

	        
	        Map<Integer, String> map = new LinkedHashMap<>();

	        map.put(1, "Java");
	        map.put(2, "C++");
	        map.put(3, "Rust");
	        map.put(4, "JavaScript");
	        map.put(5, "Go");

	        map.forEach((k, v) -> System.out.println(k + ":" + v)); 	
	    }

	    static <Integer> void math(Integer a1, Integer a2, BiConsumer<Integer, Integer> c) {
	        c.accept(a1, a2);
	    }
		
}
