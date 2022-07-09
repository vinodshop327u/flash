package com.vinod.Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class ComCompDemo {

	public static void main(String[] args) 
	{
		Employee e1=new Employee(200);
		Employee e2=new Employee(100);
		Employee e3=new Employee(500);
		Employee e4=new Employee(500);
		Employee e5=new Employee(700);
		//TreeSet t1=new TreeSet(new Mycomparator2());
		TreeSet t1=new TreeSet();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
	}

}
class Employee implements Comparable 
{
	int eid;

	public Employee(int eid) {
		super();
		this.eid = eid;
	}
	
	
	@Override
	public String toString() {
		return "  eid=" + eid + "  ";
	}


	public int compareTo(Object o) {
		int eid1=this.eid;
		Employee e2=(Employee)o;
		int eid2=e2.eid;
		if(eid1<eid2)
		{
			return -1;
		}else if (eid1>eid2) {
			return +1;
		}
		else
			
		return 0;
	}
	
}

class Mycomparator2 implements Comparator
{

	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		//return e2.compareTo(e1); //implements [  eid=700  ,   eid=500  ,   eid=200  ,   eid=100  ]
		//return e2.compareTo(e1);//without implements [  eid=100  ,   eid=200  ,   eid=500  ,   eid=700  ]
		//return e1.compareTo(e2);// implements  [  eid=100  ,   eid=200  ,   eid=500  ,   eid=700  ]
		return e1.compareTo(e2);// with out implements [  eid=100  ,   eid=200  ,   eid=500  ,   eid=700  ]
	}
	
}