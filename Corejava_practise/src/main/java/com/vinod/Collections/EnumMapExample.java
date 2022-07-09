package com.vinod.Collections;

import java.util.*;  

public class EnumMapExample 
{
	public enum Days 
	{  
		Monday, Tuesday, Wednesday, Thursday  
	};  

	public static void main(String[] args) 
	{
		EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);  
		   map.put(Days.Monday, "1");  
		   map.put(Days.Tuesday, "2");  
		   map.put(Days.Wednesday, "3");  
		   map.put(Days.Thursday, "4");  
		   // print the map  
		   Set s1=map.keySet();
		   System.out.println(s1);
		   Collection s2=map.values();
		   System.out.println(s2);
		    for(Map.Entry m:map.entrySet())
		    {    
		       System.out.println(m.getKey()+" "+m.getValue());    
		    }   
		
	}

}
