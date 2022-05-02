package com.vinod.basic.program;

public class Palindrome_String 
{
	public static void main(String[] args) {
		
	String original="vioiv";
	String reverse = " ";      
    int length = original.length();
    
    for ( int i = length - 1; i >= 0; i-- )  
       reverse = reverse + original.charAt(i);  
   
    System.out.println(reverse+"   "+original);
    if (original.equals(reverse))  
       System.out.println("Entered string/number is a palindrome.");  
    else  
       System.out.println("Entered string/number is'n a palindrome. ");   
 }  

}
