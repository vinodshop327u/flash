package com.features.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreamExample3
{
	public static void main(String[] args) {
		  List<Product> productsList = new ArrayList<Product>();
		 //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
          
     long count=  productsList.stream()  
                .filter(p->p.price>28000)
               // .map(p->p.price)
                //.collect(Collectors.toList())
                .count();
               // .forEach(System.out::println);
     System.out.println(count);
	
	}

}
