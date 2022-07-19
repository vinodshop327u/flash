package com.vinod;

public class Prime1 
{
	public static void main(String[] args) {
		  int sum = 1;
			 int ctr = 0; 
			 int n = 0; 
		    	sum=1+3+5+7;
				while (ctr < 100) {
					n++; 
					if (n % 2 != 0) { 	
						if (n % 3 != 0) {
							if (n % 5 != 0) {
								if (n % 7 != 0) {
								System.out.print("  "+n);
								sum += n;
							}
							}
						}
						
//					// check if the number is even
//						if (is_Prime(n)) {
//							System.out.println(n);
//							sum += n; 					
//						}
					}
		                    ctr++; 	
				}
				System.out.println("\nSum of the prime numbers till 100: "+sum); 
	 }
   	public static boolean is_Prime(int n) {
   		for (int i = 3; i * i <= n; i+= 2) {
   			System.out.println("if condiction="+n%i+" n= "+n+"  i= "+i);
			if (n % i != 0) {
				return false; 
			}
		}
		return true;
	}
}

