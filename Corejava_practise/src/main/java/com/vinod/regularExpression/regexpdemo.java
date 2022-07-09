package com.vinod.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexpdemo {

	public static void main(String[] args) 
	{
		int i=0; 
		Character c=new Character('a');
		String s=new String("CHLCVINODCCCC");
		Pattern p=Pattern.compile("C");
		Matcher m=p.matcher(s);
		while(m.find())
		{
			i++;
			System.out.println(m.start());
		}
		System.out.println(i);
		
		String x="Durga soft solutions"; 
		String[] s1=x.split("\\s");
		for(String s2:s1)
		{	System.out.println(s2);//www	durgasoft	com	
		}
		
		  int i1 = 0b101;     // Using b0, The b can be lower or upper case  
	        int i2 = 0B101;     // Using B0  
	        System.out.println("----------Binary Literal in Integer----------------");  
	        System.out.println("i1 = "+i1);  
	        System.out.println("i2 = "+i2);  

	}

}
