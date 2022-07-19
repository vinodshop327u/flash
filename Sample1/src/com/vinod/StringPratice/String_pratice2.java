package com.vinod.StringPratice;

public class String_pratice2
{
	public static void main(String[] args) 
	{
		String str1 = "Python";
		String str2 = "";
		//System.out.println(str1.substring(1)+""+str2.substring(1));
		System.out.println(str2.length());
		String result="";
		result+=str1.length()>=1?str1.charAt(0):"#";
		result+=str2.length()>0?str2.charAt(0):"#";
		System.out.println(result);
		
		
		String str3="123";
		if(str3.length()>=3)
		{
			System.out.println(str3.substring(0,3));
		}
		else if(str3.length()==2)
		{
			System.out.println(str3+"#");
		}else if(str3.length()==1)
		{
			System.out.println(str3+"##");
		}else
		{
			System.out.println("###");
		}
	} 
	

}
