package com.vinod.StringPratice;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution1 
{
	public static ArrayList<String> longestWords(String[] dictionary) {
        ArrayList<String> list = new ArrayList<String>();
        int longest_length = 0;
        for (String str : dictionary) {
            int length = str.length();
            if (length > longest_length) {
                longest_length = length;
                list.clear();
                
            }
            if (length == longest_length) {
                list.add(str);
                System.out.println(list);
            }
        }
        return list;
    }
    
public static void main(String[] args) {
		//String [] dict = {"cat", "flag", "green", "country", "w3resource"};
		String [] dict = {"cat", "dog", "red", "is", "am","hai","asdf"};
		System.out.println("Original dictionary : "+Arrays.toString(dict));
		System.out.println("Longest word(s) of the above dictionary: "+longestWords(dict));
	}

}
