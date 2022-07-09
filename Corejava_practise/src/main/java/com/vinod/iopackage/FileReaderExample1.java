package com.vinod.iopackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample1
{
	public static void main(String[] args) throws Exception 
	{
		/*
		 * FileReader fr=new FileReader("D:\\testout.txt"); int i;
		 * while((i=fr.read())!=-1) System.out.print((char)i); fr.close();
		 */   
		
        File f=new File("D:\\\\testout.txt");
        FileReader fr=new FileReader(f); 
        System.out.println("read= "+fr.read()); 
        char[] ch1=new char[(int)(f.length())]; 
        System.out.println("ch="+ch1.toString());
        fr.read(ch1); for(char ch:ch1)
        {
        	System.out.print(ch);
        } 
        
        System.out.println("	");
        FileReader fr1=new FileReader(f); int i=fr1.read();
        while(i!=-1)
        {System.out.print((char)i);i=fr1.read();}

        
	}

}
