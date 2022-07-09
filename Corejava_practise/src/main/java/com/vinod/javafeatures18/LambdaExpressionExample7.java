package com.vinod.javafeatures18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressionExample7{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach(n->System.out.println(n)   );
        for(String s : list) {
			//System.out.println(s);
		}
        list.stream().forEachOrdered(System.out::println);
        
        ArrayList<String> names = new ArrayList<>(Arrays.asList("A","B","C","D"));
        names.forEach(name -> {
             System.out.println(name.toUpperCase());
        });
    }  
}  
