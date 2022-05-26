package com.java.core.arimeticthOperator;

public class AssignmentOpeartor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;  
		int b=20;  
		a+=4;//a=a+4 (a=10+4)  
		b-=4;//b=b-4 (b=20-4)  
		System.out.println(a);  
		System.out.println(b); 
		a=10;
		a+=3;//10+3  
		System.out.println(a);  
		a-=4;//13-4  
		System.out.println(a);  
		a*=2;//9*2  
		System.out.println(a);  
		a/=2;//18/2  
		System.out.println(a);  
		
		
		//
		short e=10;  
		short f=10;  
		//a+=b;//a=a+b internally so fine  
		//e=e+f;//Compile time error because 10+10=20 now int  
		e=(short)(e+f);//20 which is int now converted to short  
		System.out.println(e);  
	}

}
