package com.features.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Product1
{
	int id;  
	String name;  
	float price;  
	public Product1(int id, String name, float price) {  
		this.id = id;  
		this.name = name;  
		this.price = price; 
	}
	
	/*public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price +"]";
				
	}*/
}
public class JavaStreamExample2 {

	public static  void main(String[] args) {
		 List<Product1> productsList = new ArrayList<Product1>();  
	        //Adding Products  
	        productsList.add(new Product1(1,"HP Laptop",250f));  
	        productsList.add(new Product1(6,"HP Laptop",25000f));  
	        productsList.add(new Product1(2,"Dell Laptop",30000f));  
	        productsList.add(new Product1(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product1(4,"Sony Laptop",28000f));  
	        productsList.add(new Product1(5,"Apple Laptop",90000f));  
	       
	       long count= productsList.stream()
	        		.filter(Product1->Product1.price>=250)
	        		.count();
	        		
	       System.out.println(count); 
	       
	        Product1 productA = productsList.stream()
	        .max((product1, product2)->product1.price > product2.price ? 1: -1).get(); 
	        //System.out.println("max="+productA.price);
	        
	        Product1 productmin = productsList.stream()
	    	        .min((product1, product2)->product1.price > product2.price ? 1: -1).get(); 
	    	        //System.out.println("min="+productmin.price);
	    	        
	        
	        productsList.stream()
	        .filter(Product1->Product1.name=="HP Laptop" && Product1.id==6)
	        .map(Product1->Product1.toString())
	        .forEach(System.out::println);
	        
	     double d=  productsList.stream()
	    		 .limit(3)
	    		 .collect(Collectors.summingDouble(Product1->Product1.id));
	     
	        System.out.println(d);
	        
	        // This is more compact approach for filtering data  
	        Float totalPrice = productsList.stream()  
	                    .map(product->product.price)  
	                    .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
	        System.out.println(totalPrice);  
	        // More precise code   
	        float totalPrice2 = productsList.stream()  
	                .map(product->product.price)  
	                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
	        System.out.println(totalPrice2);  
	          
	}

}
