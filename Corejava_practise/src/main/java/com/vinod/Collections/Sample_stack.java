package com.vinod.Collections;

import java.util.Stack;

public class Sample_stack 
{
	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.push('A');
		s.push(10);
		s.push(11);
		s.push(12);
		s.push(13);
		s.push(14);
		System.out.println(s);//[A, 10, 11, 12, 13, 14]
		System.out.println(s.search('A'));//6
		System.out.println(s.peek());//14
		System.out.println(s.empty());//false
	}

}
