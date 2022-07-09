package com.vinod.ExceptionHandling;

public class Sample12 
{
	public static void main(String[] args) 
	{
		int age=10; if(age<18)
		{throw new TooYoungException("please wait some more than age is too young ");} else if(age>60){throw new TooOldException("please wait some than old exception");
		}else{ System.out.println("you will get match details by mail..age."); }
		
	}

}
class TooYoungException extends RuntimeException
{TooYoungException(String s){	super(s);	}	} 
class TooOldException extends RuntimeException
{ TooOldException(String s){ super(s);	}	} 


