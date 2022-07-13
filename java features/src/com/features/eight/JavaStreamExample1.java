package com.features.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product
{
	int id;  
	String name;  
	float price;  
	public Product(int id, String name, float price) {  
		this.id = id;  
		this.name = name;  
		this.price = price; 
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price +"]";
				
	}
}

public class JavaStreamExample1 
{
	public static void main(String[] args) 
	{
		List<Product> productsList = new ArrayList<Product>();  
		//Adding Products  
		productsList.add(new Product(1,"HP Laptop",25000f));  
		productsList.add(new Product(2,"Dell Laptop",30000f));  
		productsList.add(new Product(3,"Lenevo Laptop",28000f));  
		productsList.add(new Product(4,"Sony Laptop",28000f));  
		productsList.add(new Product(5,"Apple Laptop",90000f));  
		List<Float> productPriceList = new ArrayList<Float>();  
		for(Product product: productsList){  
			if(product.price<30000){  
				productPriceList.add(product.price);   			}  
		}  System.out.println(productPriceList);   // displaying data  
		
		//With using Filtering Collection by using Stream
		List<Float> productPriceList2 =productsList.stream()  
				.filter(p -> p.price < 30000)// filtering data  
				.map(p->p.price)        // fetching price  
				.collect(Collectors.toList()); // collecting as list  
				System.out.println(productPriceList2);  
				
				Stream.iterate(2, element->element+1)  
		        .filter(element->element%10==0)  
		        .limit(3)  
		        .forEach(games->System.out.println(games));  
		   				
		        List<String> gamesList = new ArrayList<String>();  
		        gamesList.add("Football");  
		        gamesList.add("Cricket");  
		        gamesList.add("Chess");  
		        gamesList.add("Hocky");  
		        System.out.println("------------Iterating by passing lambda expression---------------");  
		        gamesList.stream()
		        .forEachOrdered(games -> System.out.println(games));  
		        System.out.println("------------Iterating by passing method reference---------------");  
		        gamesList.stream().forEachOrdered(System.out::println);

				
	}//main
}//class
