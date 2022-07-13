package com.features.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Employee
{
	private String id;
	private String name;
	private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" : "+this.name+" : "+this.age;
	}
	public static List<Employee> getemployee()
	{
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("11","A",101));
		list.add(new Employee("12","B",102));
		list.add(new Employee("13","C",103));
		list.add(new Employee("14","D",104));
		list.add(new Employee("15","E",105));
		list.add(new Employee("16","F",106));
		list.add(new Employee("17","G",107));
		list.add(new Employee("18","H",108));
		list.add(new Employee("19","I",109));
		list.add(new Employee("20","G",110));
		list.add(new Employee("21","K",111));
		return list;
	}

	public static void main(String[] args) 
	{
		
		

	}

}
