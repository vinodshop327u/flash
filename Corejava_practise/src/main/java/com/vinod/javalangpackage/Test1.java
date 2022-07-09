package com.vinod.javalangpackage;

public class Test1 
{
	public static void main(String[] args) {
		
		
		final StringBuffer sb1=new StringBuffer("vinod");
		//sb1=new StringBuffer("hai");
		System.out.println(sb1);
		
		Integer i1=Integer.valueOf(10);
		int i2=Integer.valueOf(i1);
		System.out.println(i2);//10
		
		final StringBuffer sb=new StringBuffer("vinod");
		sb.insert(3, "srinu");
		System.out.println(sb);//Test1.java
		
		
		/*
		 * String s1=new String("you cannot change me!"); String s2=new
		 * String("you cannot change me!"); System.out.println(s1==s2);//false
		 * System.out.println(s1.equals(s2));//true String s3="you cannot change me!";
		 * String s4="you cannot change me!"; System.out.println(s3==s4);//true
		 * System.out.println(s3.equals(s4));//true System.out.println(s1==s4);//false
		 * System.out.println(s1.equals(s4));//true String s5="you cannot"
		 * +" change me!"; System.out.println(s5);//you cannot change me!
		 * System.out.println(s3==s5);//true System.out.println(s3.equals(s5));//true
		 * System.out.println(s4==s5);//true System.out.println(s4.equals(s5));//true
		 * String s6="you cannot"; String s7=s6+" change me!"; System.out.println(s7);
		 * System.out.println(s3==s7); System.out.println(s3.equals(s7));//true
		 * System.out.println(s4.equals(s7));//true
		 */		
		
		
		/*
		 * s1.concat("software"); s1.concat("solutions"); System.out.println(s1);//vinod
		 * String s2=s1.concat("soft"); System.out.println(s2);//vinodsoft
		 */		
	
	}

}
