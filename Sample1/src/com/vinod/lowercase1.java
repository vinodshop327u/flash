package com.vinod;

import java.util.Scanner;

public class lowercase1 
{
	public static void main(String[] args) {
		String str="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
		String tolowwer="";
		tolowwer=str.toLowerCase();
		System.out.println(tolowwer);
		tolowwer="";
		Scanner sc=new Scanner(str);
		while(sc.hasNext())
		{
			String word=sc.next();
			tolowwer+=word.toLowerCase()+" ";
		}
		System.out.println(tolowwer.trim());
		
		 String line = str;
		 String[] words = line.split(" ");
		 System.out.println("Penultimate word: "+words[words.length -3]);
		 System.out.println(Math.abs(-90));
	}

}
