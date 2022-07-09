package com.vinod.javafeatures18;

interface Drawable{  
    public void draw();  
}  

public class LambdaExpressionExample1  implements Drawable
{
	static int width=15;
	public static void main(String[] args) 
	{
		new LambdaExpressionExample1().draw();
		
		/*
		 * Drawable d=new Drawable(){ public void
		 * draw(){System.out.println("Drawing "+width);} }; d.draw();
		 */ 
		
	}
	public void draw() {
		System.out.println("Drawing="+width);
		
	}
}
