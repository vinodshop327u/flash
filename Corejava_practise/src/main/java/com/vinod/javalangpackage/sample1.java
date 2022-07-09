package com.vinod.javalangpackage;

public class sample1 
{
	

	 String name;
	 int rollno;
	 sample1(String name,int rollno)
	 {
		 this.name=name;
		 this.rollno=rollno;
	 }
	 
	 
	@Override
	public String toString() {
		return "sample1 [name=" + name + ", rollno=" + rollno + "]";
	}


	public static void main(String[] args) 
	{
		sample1 s1=new sample1("vinod",1);
		sample1 s2=new sample1("jasvin",2); 
		sample1 s3=new sample1("hai",3);
		sample1 s4=s3;
		System.out.println(s4.equals(s3));
	}

}
