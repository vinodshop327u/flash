package com.vinod.Collections;

import java.util.TreeSet;

public class Compareto1 {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		t.add("z"); // "K".compareTo("z"); 
		t.add("K"); // "D".compareTo("k");
		t.add("D"); //  "M".compareTo("D");
		t.add("M"); //  "M".compareTo("K");
		t.add("D"); //  "D".compareTo("D");
		//t.add(null); //Nullpointer Exception
		System.out.println(t);//[D, K, M, z]
		
		
	}

}
