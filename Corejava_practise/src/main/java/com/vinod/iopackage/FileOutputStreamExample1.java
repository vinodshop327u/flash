package com.vinod.iopackage;

import java.io.FileOutputStream;  

public class FileOutputStreamExample1 
{
	public static void main(String[] args) 
	{
		 try(FileOutputStream fout=new FileOutputStream("D:\\testout.txt")){    
             
             fout.write(65); 
             fout.write('A');
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
		
	}

