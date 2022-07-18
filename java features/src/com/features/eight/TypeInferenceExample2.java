package com.features.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class GenericClass<X> {  
    X name;  
  public void setName(X name){  
      this.name = name;  
    }  
  public X getName(){  
      return name;  
    }  
  public String genericMethod(GenericClass<String> x){  
      x.setName("John");  
      return x.name;  
    }  
}  

public class TypeInferenceExample2 
{
	public static void main(String[] args) 
	{
		 GenericClass<String> genericClass = new GenericClass<String>();  
	        genericClass.setName("Peter");  
	        System.out.println(genericClass.getName());  
	          
	        GenericClass<String> genericClass2 = new GenericClass<>();  
	        genericClass2.setName("peter");  
	        System.out.println(genericClass2.getName());  
	      
	        // New improved type inference  
	        System.out.println(genericClass2.genericMethod(new GenericClass<String>())); 
	        
	        Stream<String> stream = Stream.of("one", "two", "three", "four");
	        boolean match = stream.anyMatch(s -> s.contains("four"));
	        System.out.println(match);
	        
	        List<Integer> li=new ArrayList<Integer>();
	}
	
	private static int sumStream(List<Integer> list) {
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}
}
