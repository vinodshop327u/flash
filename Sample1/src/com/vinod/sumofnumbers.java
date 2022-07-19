package com.vinod;

public class sumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,n=54321;
		System.out.println(someofintegers(21));
		if(someofintegers(21)>10)
		{
			System.out.println(11);
		}
		else
		{
			System.out.println(12);
		}
	System.out.println(Math.PI);
	}
	
	public static int someofintegers(int sum)
	{
		int n=0;
		while(sum!=0)
		{
			n+=sum%10;
			sum/=10;
			
		}
		return n;
	}

}
