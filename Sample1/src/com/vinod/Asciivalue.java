package com.vinod;

import java.io.Console;

public class Asciivalue 
{
	public static void main(String[] args) 
	{
		int ch='z';
		System.out.println(ch);
		Console cons;
		if ((cons = System.console()) != null) {
			char[] pass_ward = "hashjas".toCharArray();
			try {
				pass_ward = cons.readPassword("Input your Password:");
				System.out.println(pass_ward.toString().length());
				System.out.println("Your password was: " + new String(pass_ward));
			} finally {
				if (pass_ward != null) {
					java.util.Arrays.fill(pass_ward, ' ');
				}
			}
		} else {
			throw new RuntimeException("Can't get password...No console");
		}
	}

}
