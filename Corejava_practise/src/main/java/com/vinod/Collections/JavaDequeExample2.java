package com.vinod.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class JavaDequeExample2 {
	public static void main(String[] args) {
		
	Deque<String> deque1 = new ArrayDeque<String>();  
	   // Adding the element in the front of the deque.  
	   deque1.addFirst("Java");  
	    System.out.println("The first element is : "+deque1);  
	   // Again adding the element in the front of the deque.  
	    deque1.addFirst("Python");  
	    System.out.println("After adding the next element in the front of the deque : "+deque1);  
	     deque1.add("Ruby");  
	     System.out.println("The final deque is  : "+deque1);  
	   // Returns the number of elements.  
	     int size =  deque1.size();  
	     System.out.println("The number of elements are : "+size);  
	    // Removes the last element.  
	     deque1.removeLast();  
	 System.out.println("Deque after removing the last element is given as :  "+deque1);  
	   }    
}
