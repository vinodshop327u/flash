package com.vinod.StringPratice;

public class String_pratice1
{
	public static void main(String[] args) 
	{
		 String main_string = "Python 3.0";
	     String last_three_chars = main_string.substring(main_string.length() - 3);
		// System.out.println(last_three_chars);
		// System.out.println(last_three_chars + last_three_chars + last_three_chars + last_three_chars);
		   
		   String main_string1="python";
		  // System.out.println(main_string1.substring(1,6));
		   //System.out.println(main_string1.substring(0,main_string1.length()/2));
		   
		   String str1 = "Python";    
			String str2 = "Tutorial"; 
			
			if(str1.length() >= str2.length())
				System.out.println("1"+ str2+str1+str2);
			else
			System.out.println("2"+str1+str2+str1);
	}

}
