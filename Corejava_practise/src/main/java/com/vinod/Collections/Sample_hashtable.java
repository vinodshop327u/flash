package com.vinod.Collections;

import java.util.Hashtable;

public class Sample_hashtable 
{
	public static void main(String[] args) 
	{
		Hashtable h=new Hashtable();
		h.put(new Temp(10),"A");
		h.put(new Temp(4),"B");
		h.put(new Temp(5),"C");
		h.put(new Temp(15),"D");
		h.put(new Temp(20),"E");
		//h.put("vinod",null); //java.lang.NullPointerException
		System.out.println(h);//{10 =A, 20 =E, 5 =C, 15 =D, 4 =B}
		
	}

}
class Temp
{
	int i;
	Temp(int i)
	{
		this.i=i;
	}
	@Override
	public int hashCode() {
		return i;
	}
	@Override
	public String toString() {
		return i+" ";
	}
	
	
}
