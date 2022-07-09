package com.vinod.javafeatures18;

//@FunctionalInterface  //It is optional  
interface Drawable1{  
    //public void draw();  
    public String drawing(String st);
    
}  

public class LambdaExpressionExample2 {
	public static void main(String[] args) {  
       final int width=13;  
          //String st="vinod";
        //with lambda   
       // Drawable1 d2=()->{ System.out.println("Drawing "+width); };  
        Drawable1 d5=(st)->{
        	return "hello."+st;
        };
       System.out.println(d5.drawing("hai"));
        //d2.draw();  
    }  
}
