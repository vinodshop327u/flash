package com.vinod.RestFull.SB.RestExamples.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.RestFull.SB.RestExamples.IProductService;
import com.vinod.RestFull.SB.RestExamples.pojo.Product;

@RestController
public class ProductController 
{
	@Autowired  
	private IProductService productService;  

	@GetMapping(value = "/product",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProduct()   
	{  
		//finds all the products  
		List<Product> products = productService.findAll();  
		return products;  
	}
	
	@GetMapping("/product/findbyid/{id}") 
	public List<Product> findbyID(@PathVariable int id)   
	{  
		//finds all the products  
		List<Product> products = productService.findbyID(id);  
		return products;  
	}
	
	@GetMapping("/product/deletebyId/{id}") 
	public void deletebyid(@PathVariable int id)   
	{  
		//finds all the products  
		 productService.deletebyid(id);  
		  
	}
	@GetMapping("/product/deletebyall")
	public void deleteAllData()
	{
		productService.deleteAllData();
	}
	
	
	@GetMapping(value="/pproducts",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> PostProduct()   
	{  
		//finds all the products  
		List<Product> products = productService.findAll();  
		return products;  
	}
	
		@GetMapping("/add/{num1}/{num2}")
		public int addtwonumbers(@PathVariable("num1") int num1,@PathVariable("num2") int num2)
		{
			return num1+num2;
		}
		
	
		@GetMapping("/add")
		public int intmembers(@PathParam("num1") int num1,@PathParam("num1") int num2)
		{
			return num1+num2;
		}
	}
