package com.vinod.basic.program;

public class HashcodeExample extends Employee
{
	public HashcodeExample(int regno, String name) {
		super(regno, name);
		// TODO Auto-generated constructor stub
	}

	@Override  
	public boolean equals(Object obj)   
	{  
		if (obj == null)   
			return false;  
		if (obj == this)  
			return true;  
		return this.getRegno() == ((Employee) obj). getRegno();  
	}  

	public static void main(String[] args)   
	{  
		//creating two instances of the Employee class  
		Employee emp1 = new Employee(918, "Maria");  
		Employee emp2 = new Employee(918, "Maria");  
		//invoking hashCode() method  
		int a=emp1.hashCode();  
		int b=emp2.hashCode();  
		System.out.println("hashcode of emp1 = " + a);  
		System.out.println("hashcode of emp2 = " + b);  
		System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));  
	}  

}
