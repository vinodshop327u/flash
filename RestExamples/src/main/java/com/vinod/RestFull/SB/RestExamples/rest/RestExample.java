package com.vinod.RestFull.SB.RestExamples.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class RestExample 
{
	//http://localhost:9090/hello/
	@GetMapping(path="/")
	public String getEmployees() 
	{
		return "<h1>Hello</h1>";
	}

	@GetMapping(value = "/product")  
	public String getProduct()   
	{  
		//finds all the products  
		
		//returns the product list  
		return "<h1>Getproducts()</h1>";  
	}  
}
