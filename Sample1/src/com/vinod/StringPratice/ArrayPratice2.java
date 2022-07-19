package com.vinod.StringPratice;

import java.util.Arrays;

public class ArrayPratice2 
{
	public static void main(String[] args) 
	{
		int[] array_nums = {20, 30, 40, 220, 67, 293, 278};
		System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		int max_val = array_nums[0];
		if(max_val <= array_nums[array_nums.length-1])
			max_val = array_nums[array_nums.length-1];
		if(max_val <= array_nums[array_nums.length/2])
			max_val = array_nums[array_nums.length/2];
		System.out.println("Largest element between first, last, and middle values: "+max_val); 
		
		
		
		
			String result = "";
		   int[] left_array = {1, 3, -5, 4, 5};
		   int[] right_array = {1, 4, -5, -2, 8};
		   System.out.println("\nArray1: "+Arrays.toString(left_array));  
		   System.out.println("\nArray2: "+Arrays.toString(right_array)); 
	       for (int i = 0; i < left_array.length; i++) {
					int num1 = left_array[i];
					int num2 = right_array[i];
					result += Integer.toString(num1 * num2) + " "; 
				}
			System.out.println("\nResult: "+result);  
			
	}

}
