package com.features.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class foreach1 
{
	public static void main(String[] args) 
	{
		List<String> list= new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
//		Consumer<String> action=new Consumer<String>() {
//			
//			@Override
//			public void accept(String t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		};//consumer
		
		//list.forEach(action);
		
		
		Consumer<String> actionlambda=(t)->{
			list.add("hai");
			System.out.println(t);
			//list.add("hai");
		};
		list.forEach(actionlambda);
		
		list.forEach((n)->System.out.println(n) );  
	}//main

}//class
