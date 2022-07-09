package com.vinod.Collections.generics;

import java.util.ArrayList;

public class Sample1 
{
	public static void main(String[] args) 
	{
		String[] s=new String[10];
		s[0]="durga";
		s[1]="vinod";
		s[2]="jasvin";
		s[3]=new String();//incompatable type
		System.out.println(s.toString());

		ArrayList<String> l=new ArrayList<String>();
		l.add("vinod");



	}

}

class BoundedTest<T extends Number>{

	BoundedTest<Integer> u1 = new BoundedTest<Integer>();//Correct
	BoundedTest<Double> u2 = new BoundedTest<Double>();//Correct
	//BoundedTest<String> u3 = new BoundedTest<String>();//Compile Time Error(Type parameter String is not in its bound)
}

