package com.vinod.LanguageFundamentals;

public class sample_while 
{
	public static void main(String[] args) 
	{
		int x=10,y=20;
		while(x<y)
		{
			int a=10;
			//System.out.println("while"+a);
			break;
		}
		//System.out.println(a);
		
		do
		{
			int a=10;
			//System.out.println("while"+a);
			break;
		}while(x>y);
		int i=0;
		/*
		 * for(System.out.println("Hello u r sleeping"); i<8;i++) {
		 * System.out.println("No boss u only sleeping"); }
		 */
		for(i=0;i<=10;i++)
		{
			//System.out.println(i%2==0);
			if(i%2==0)
			continue;
			System.out.println(i);
		}
	}

}
