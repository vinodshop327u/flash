package com.vinod.iopackage;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class DataInputStream1 
{
	public static void main(String[] args)throws Exception 
	{
		InputStream input = new FileInputStream("D:\\testout.txt");  
	    DataInputStream inst = new DataInputStream(input);  
	    int count = input.available();  
	    System.out.println(count);
	    byte[] ary = new byte[count];  
	    inst.read(ary);  
	    for (byte bt : ary) {  
	      char k = (char) bt;  
	      System.out.print(k+"-");  
	    }  
		
	}

}
