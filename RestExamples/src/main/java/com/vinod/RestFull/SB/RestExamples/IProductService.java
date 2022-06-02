package com.vinod.RestFull.SB.RestExamples;

import java.util.List;

import com.vinod.RestFull.SB.RestExamples.pojo.Product;

public interface IProductService
{
	List<Product> findAll();  
	List<Product> findbyID(int id);
	void addBook(Product b);
    void deleteAllData();
    void deletebyid(int id);

}
