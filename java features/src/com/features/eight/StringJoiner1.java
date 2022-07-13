package com.features.eight;

import java.util.StringJoiner;

public class StringJoiner1 
{
	public static void main(String[] args) 
	{
		StringJoiner joinNames = new StringJoiner(",", "[", "]");   // 1
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
        System.out.println(joinNames); 
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  // 2
		joinNames2.add("Peter");  
        joinNames2.add("Raheem"); 
        System.out.println(joinNames2); 
        StringJoiner merge = joinNames.merge(joinNames2);
        System.out.println(merge); 
		
	}

}
