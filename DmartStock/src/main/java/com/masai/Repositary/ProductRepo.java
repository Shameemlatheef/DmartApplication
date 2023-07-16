package com.masai.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
