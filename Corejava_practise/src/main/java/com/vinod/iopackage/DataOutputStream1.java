package com.vinod.iopackage;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream1 
{ 
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file = new FileOutputStream("D:\\textout.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess..."); 
}

}
