package com.masai.Service;

import java.util.List;

import com.masai.Exception.ProductException;
import com.masai.model.Product;

public interface ProductService {

	public Product AddProduct(Product prod) throws ProductException;
	public Product UpdateProduct(Product upprod)throws ProductException;
	public Product DeleteProduct(Integer id)throws ProductException;
	public Product viewProduct(Integer proid)throws ProductException;
	public List<Product> Viewproduct()throws ProductException;
	
}
