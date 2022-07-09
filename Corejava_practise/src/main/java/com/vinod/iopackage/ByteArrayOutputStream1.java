package com.vinod.iopackage;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStream1 
{
	public static void main(String[] args) throws Exception
	{
		 FileOutputStream fout1=new FileOutputStream("D:\\textout.txt");    
	     FileOutputStream fout2=new FileOutputStream("D:\\textIn.txt");    
	     ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      
	     String s="Welcome to Vinod Solutions.";    
         byte b[]=s.getBytes();
	      bout.write(b);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	      bout.flush();    
	      bout.close();//has no effect    
	      System.out.println("Success...");    
	     }    
	}

