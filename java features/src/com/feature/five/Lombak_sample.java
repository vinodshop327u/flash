package com.feature.five;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Getter
@Setter
public class Lombak_sample 
{
	private int a=10;
	private int b=20;
	
	public String m1()
	{
		System.out.println(a+"  "+b);
		return a+"  "+b;
	}
	
}
