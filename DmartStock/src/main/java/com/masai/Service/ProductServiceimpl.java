package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.ProductException;
import com.masai.Repositary.ProductRepo;
import com.masai.model.Product;
@Service
public class ProductServiceimpl implements ProductService {
@Autowired
private ProductRepo prepo;

@Override
public Product AddProduct(Product prod) throws ProductException {
	Product p=prepo.save(prod);
	if(p==null){
		throw new ProductException("nott saved");
	}
	else {
		return p;
	}
	
}

@Override
public Product UpdateProduct(Product upprod) throws ProductException {
	Optional<Product> op=prepo.findById(upprod.getProductid());
	if(op.isEmpty()) {
		throw new ProductException("Product not found");
	}
	else {
		Product newprod=prepo.save(upprod);
		return newprod;
	}
}

@Override
public Product DeleteProduct(Integer id) throws ProductException {
	Optional<Product> delpro=prepo.findById(id);
	if(delpro.isEmpty()) {
		throw new ProductException("product not deleted or not found");
	}
	else {
		Product delproduct=delpro.get();
				prepo.delete(delproduct);
				return delproduct;
	}
}

@Override
public Product viewProduct(Integer proid) throws ProductException {
	Optional<Product> view=prepo.findById(proid);
	if(view.isEmpty()) {
		throw new ProductException("Prodcut not found");
		
	}
	else {
		Product viewprod=view.get();
		return viewprod;
	}
}

@Override
public List<Product> Viewproduct() throws ProductException {
	
	List<Product> all=prepo.findAll();
	if(all.isEmpty()) {
		throw new ProductException("no prodcut found");
	}
	else
	return all;
}


	
}
