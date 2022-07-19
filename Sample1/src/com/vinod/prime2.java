package com.vinod;

public class prime2 {

	public static void main(String[] args) {
		 int sum = 1;
		 int ctr = 0; 
		 int n = 0; 
	    	
			while (ctr < 150) {
				n++; 
				if (n % 2 != 0) { 
				// check if the number is even
					if (is_Prime(n)) {
						//System.out.print("\t n="+n);
						sum += n; 					
					}
				}
	                    ctr++; 	
			}
			System.out.println("\nSum of the prime numbers till 100: "+sum); 	
		 }
		
	   	public static boolean is_Prime(int n) {
			for (int i = 3; i * i <= n; i+= 2) {
				System.out.println("if condiction="+n%i+" n= "+n+"  i= "+i+"  i*i="+i*i);
				if (n % i == 0) {
					
					return false; 
				}
			}
			return true;
		}

}
