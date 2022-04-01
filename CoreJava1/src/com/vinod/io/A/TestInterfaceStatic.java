package com.vinod.io.A;

interface Drawable1{  
	void draw();  
	static int cube(int x){return x*x*x;}  
}  
class Rectangle1 implements Drawable1{  
	public void draw(){System.out.println("drawing rectangle");}  
}  

class TestInterfaceStatic{  
	public static void main(String args[]){  
		Drawable1 d=new Drawable1() {

			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("ADSfasdfasdfsda");
			}
		};  
		d.draw();  
		System.out.println(Drawable1.cube(10));  
	}}  
