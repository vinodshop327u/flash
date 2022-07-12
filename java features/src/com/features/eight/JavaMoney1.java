package com.features.eight;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class JavaMoney1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> func = x -> x.length();
        Integer apply = func.apply("mkyongvi");   // 8
        System.out.println(apply);
        
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(10, 5);    // 3

        BiConsumer<String, String> addstring=(x, y)->System.out.println(x.length()+y.length());
        addstring.accept("jasvinodati", "dhatrija");
	
        addTwo(1, 2, (x, y) -> System.out.println(x + y));          // 3
        addTwo("Node", ".js", (x, y) -> System.out.println(x + y)); // Node.js
        addTwo(10, 15, (d,v)->System.out.println(d+v));
	}
	  		static <T> void addTwo(T a1, T a2, BiConsumer<T, T> c)
	  		{
	  				c.accept(a1, a2);
	    }

}
