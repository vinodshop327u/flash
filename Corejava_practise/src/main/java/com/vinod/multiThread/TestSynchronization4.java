package com.vinod.multiThread;

public class TestSynchronization4 
{
	public static void main(String[] args) 
	{
		MyThread11 t1=new MyThread11();    
		MyThread12 t2=new MyThread12();    
		MyThread13 t3=new MyThread13();    
		MyThread14 t4=new MyThread14();    
		t1.start();    
		t2.start();    
		t3.start();    
		t4.start();    
		
	}

}

class Table  
{     
 synchronized static void printTable(int n){    
   for(int i=1;i<=10;i++){    
     System.out.println(n*i);    
     try{    
       Thread.sleep(400);    
     }catch(Exception e){}    
   }    
 }    
}    
class MyThread11 extends Thread{    
public void run(){Table.printTable(1);	}  }   

class MyThread12 extends Thread{    
public void run(){   Table.printTable(10);	}	}  

class MyThread13 extends Thread{    
public void run(){	Table.printTable(100);	}	}

class MyThread14 extends Thread{    
public void run(){	Table.printTable(1000);	}	}    
