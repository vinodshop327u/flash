package com.vinod.RestFull.SB.RestExamples.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vinod.RestFull.SB.RestExamples.IProductService;
import com.vinod.RestFull.SB.RestExamples.pojo.Product;


@Service  
public class ProductService implements IProductService
{

	@Override
	public List<Product> findAll() {
		
		ArrayList<Product> products = new ArrayList<Product>();  
		//adding products to the List  
		products.add(new Product(100, "Mobile", "CLK98123", 9000.00, 6));  
		products.add(new Product(101, "Smart TV", "LGST09167", 60000.00, 3));  
		products.add(new Product(102, "Washing Machine", "38753BK9", 9000.00, 7));  
		products.add(new Product(103, "Laptop", "LHP29OCP", 24000.00, 1));  
		products.add(new Product(104, "Air Conditioner", "ACLG66721", 30000.00, 5));  
		products.add(new Product(105, "Refrigerator ", "12WP9087", 10000.00, 4));  
		//returns a list of product  
		
		
		return products;
	}

	@Override
	public List<Product> findbyID(int id) {
	
		System.out.println("-----------------------------"+id);
		List<Product> products= GetData();
				
		return products;
	}

	@Override
	public void addBook(Product b) {
		
		System.out.println("record added succefully");
		
	}

	@Override
	public void deleteAllData() {
		System.out.println("Delete all records......");
		
	}
	@Override
	public void deletebyid(int id) 
	{
		
		
		System.out.println("-----------------------------"+id);
		System.out.println("Record deleted..........");
	}
	public List<Product> GetData()
	{
		ArrayList<Product> products = new ArrayList<Product>();  
		//adding products to the List  
		products.add(new Product(1, "Mobile", "CLK98123", 9000.00, 6));  
		products.add(new Product(2, "Smart TV", "LGST09167", 60000.00, 3));  
		products.add(new Product(3, "Washing Machine", "38753BK9", 9000.00, 7));  
		products.add(new Product(4, "Laptop", "LHP29OCP", 24000.00, 1));  
		products.add(new Product(5, "Air Conditioner", "ACLG66721", 30000.00, 5));  
		products.add(new Product(6, "Refrigerator ", "12WP9087", 10000.00, 4));  
				
		return products;
	}
}
