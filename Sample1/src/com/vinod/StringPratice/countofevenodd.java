package com.vinod.StringPratice;

import java.util.Arrays;

public class countofevenodd
{
	public static void main(String[] args) 
	{
//		int[] nums = {5, 7, 2, 4, 9,10,11};
//		int ctr_even = 0, ctr_odd = 0;
//		System.out.println("Original Array: "+Arrays.toString(nums)); 
//		    
//	    for(int i = 0; i < nums.length; i++) {
//	        if(nums[i] % 2 == 0)
//			{         
//	          ctr_even++;
//			}
//			else
//			   ctr_odd++;	
//	    }                 
//	    System.out.printf("\nNumber of even elements in the array: %d",ctr_even);
//		System.out.printf("\nNumber of odd elements in the array: %d",ctr_odd);
		
		int[] nums = {10, 10, 2, 4, 9};
		//int[] nums = {10, 10, 2, 4, 20, 20};  
		int ctr_even = 0, ctr_odd = 0;
		System.out.println("Original Array: "+Arrays.toString(nums)); 
		    
	    boolean found1010 = false;
	    boolean found2020 = false;
	      
	    for(int i = 0; i < nums.length - 1; i++) {
	        if(nums[i] == 10 && nums[i+1] == 10)
	            found1010 = true;
	                        
	        if(nums[i] == 20 && nums[i+1] == 20)
	            found2020 = true;
	    }
	   
		System.out.printf( String.valueOf(found1010 != found2020));	
		System.out.printf("\n");
	}

}
