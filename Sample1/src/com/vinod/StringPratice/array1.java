package com.vinod.StringPratice;

import java.util.Arrays;

public class array1 {
	public static void main(String[] args) {
		 int[] array_nums = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
			int i = 0;
		    System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		    for(int j = i + 1; j < array_nums.length; j++) {
		        if(array_nums[j] % 2 != 0) {
		        	System.out.println(i+"  "+j);
		        	int temp=array_nums[i];
		            array_nums[i] = array_nums[j];
		            array_nums[j] = temp;
		            i++;
		            System.out.println("New Array: "+Arrays.toString(array_nums));
		        }
		    }                                                    
		  
			// System.out.println("New Array: "+Arrays.toString(array_nums));
		    
		    int n= 15;
			String[] arr_string = new String[n];
		    for( i = 0; i < n; i++)
		        arr_string[i] = String.valueOf(i);                                  
			 System.out.println("New Array: "+Arrays.toString(arr_string)); 
			 }
	}

