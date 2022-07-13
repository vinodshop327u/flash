package com.features.eight;

import java.util.Optional;

import javax.swing.text.html.Option;

public class Optionalclass1 
{
	public static void main(String[] args) {
		user u=new user();	
		//u.setUsername("vinod");
	Optional<String> option1=u.getUsername();
	System.out.println(option1.isPresent());
		
	
	System.out.println(u.getUsername());
	
	if(u.getUsername().isPresent()&& option1.isPresent() && option1.get().equalsIgnoreCase("vinod"))
	{
		System.out.println("name is equal to vinod");
	}else
	{
		System.out.println("no equal");
	}
	}
}

class user
{
	private String username;

	public Optional<String> getUsername() {
		return Optional.ofNullable(username);
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}