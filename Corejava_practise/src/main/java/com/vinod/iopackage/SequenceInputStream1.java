package com.vinod.iopackage;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStream1 
{
	public static void main(String[] args) 
	{
		try(FileInputStream input1=new FileInputStream("D:\\testin.txt");    
			FileInputStream input2=new FileInputStream("D:\\testout.txt");)
		{
		   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
		   int j;    
		   while((j=inst.read())!=-1){    
		    System.out.print((char)j);    
		   } //while   
		   inst.close();    
		   input1.close();    
		   input2.close();  
		}catch(Exception e) {e.printStackTrace();}
	}
	}
