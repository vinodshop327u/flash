package com.vinod;

import java.util.Scanner;

public class Dividedbythree 
{
	public static void main(String[] args) 
	{
		System.out.println("Divided by 3= ");
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				//System.out.print("\t"+i);
			}
		}
		System.out.println();
		System.out.println("Divided by 5= ");
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				//System.out.print("\t"+i);
			}
		}
		System.out.println();
		//System.out.println("Divided by 3 and 5= ");
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				//System.out.print("\t"+i);
			}
		}
		String s=new String("12");
		int a=Integer.parseInt(s);
		//System.out.println(a);
		
//		Scanner in = new Scanner(System.in);
//        System.out.print("Input the first number : ");
//        int x = in.nextInt();  
//		System.out.print("Input the second number: ");
//		int y = in.nextInt(); 
//		System.out.print("Input the third number : ");
//        int z = in.nextInt(); 
//        System.out.print("The result is: "+sumoftwo(x, y, z));
//		System.out.print("\n");
//		System.out.print("The result is: "+test(x, y, z, true));
//		System.out.print("\n");
//		System.out.print("The result is: "+test_last_digit(x, y, z,true));
//		System.out.print("\n");
		
		int re=result(100);
		System.out.println(re);
		
    }
	public static int result(int num) {	
		int ctr = 0;
        for(int i=1; i<=(int)Math.sqrt(num); i++) {
            if(num%i==0 ) {
                ctr+=2;
            } else if (i*i==num) {
                ctr++;
            }
        }
        return ctr;
	}
    public static boolean sumoftwo(int p, int q, int r)
      {	// 5 10 15
         return ((p + q) == r || (q + r) == p || (r + p) == q);	
	   }
    public static boolean test(int p, int q, int r, boolean xyz)
    {
	   
	   return (q > p && r > q && r > q);
    }
    public static boolean test_last_digit(int p, int q, int r, boolean xyz)
    {
	     return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
    }

}
