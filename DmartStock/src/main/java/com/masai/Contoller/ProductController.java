package com.masai.Contoller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.ProductException;
import com.masai.Service.ProductService;
import com.masai.model.Product;

@RestController
public class ProductController {

	@Autowired
	private ProductService pservice;
	@PostMapping("/addproduct")
	ResponseEntity<Product> RegisterProduct(@RequestBody Product prod) throws ProductException{
		System.out.println(prod);
		Product pro=pservice.AddProduct(prod);
		return new ResponseEntity<Product>(pro,HttpStatus.CREATED);
		
	}
	@PutMapping("/update")
	ResponseEntity<Product> UpdateProduct(@RequestBody Product prod) throws ProductException{
		
		Product produ=pservice.UpdateProduct(prod);
		return new ResponseEntity<Product>(produ,HttpStatus.ACCEPTED);
		
	}
	@DeleteMapping("/deleteproduct")
	ResponseEntity<Product> DeleteProduct(@RequestParam Integer productid) throws ProductException{
		
		Product produc=pservice.DeleteProduct(productid);
		return new ResponseEntity<Product>(produc,HttpStatus.OK);
		
	}
	@GetMapping("/viewproduct")
	ResponseEntity<Product> ViewProduct(@RequestParam Integer productid) throws ProductException{
		
		Product product=pservice.viewProduct(productid);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
		
	}
	@GetMapping("/viewproducts")
	ResponseEntity<List<Product>> viewAllrProduct() throws ProductException{
		
		List<Product> products=pservice.Viewproduct();
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
		
	}
	
}
