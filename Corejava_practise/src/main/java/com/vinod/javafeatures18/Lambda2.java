package com.vinod.javafeatures18;

import java.util.ArrayList;
import java.util.List;

interface Sayable10
{  
    //public String say(String name); 
    //public void say1();
    //public String say2(String name1,String name2);
    //public Integer add(int a,int b);
	  public String say3(String msg); 
}  

public class Lambda2 
{
	public static void main(String[] args) 
	{
		 List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai"); 
	       for (String list1 : list) {
			System.out.println(list1);
		} 
	       list.forEach((n)->System.out.println(n) );
		
		
		int width=10;
		/*
		 * Sayable10 say1=(name)->{ return "vinod="+name; };
		 * System.out.println(say1.say("jasvin"));
		 * 
		 * Sayable10 say2=(name)->{ return "hai==="+name; };
		 * System.out.println(say2.say("hai123"));
		 */
	
			/*
		 * Sayable10 say3=()->{System.out.println("hai123="+width); }; say3.say1();
		 */
		
		//Sayable10 say4=(name1,name2)->{return name1+name2;	};
		//System.out.println(say4.say2("vinod", " jasvin"));
		
		//Sayable10 say5=(a,b)->{	return a+b;	};
		//System.out.println(say5.add(10, 10));
		
		
		//Sayable10 say6=(a,b)->(a+b);
		//System.out.println(say6.add(10, 10));
		
		Sayable10 say7=(msg)->{
			String name="  vinod";
			String name2=name+"   haicsjcsclsd";
			return "hai"+name2+msg; 
		};
		System.out.println(say7.say3("  scsdaSasdASDa "));
		
	}	
	}
