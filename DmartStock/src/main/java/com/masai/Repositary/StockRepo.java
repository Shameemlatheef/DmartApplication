package com.masai.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Stock_Product_location;
@Repository
public interface StockRepo extends JpaRepository<Stock_Product_location, Integer>{

}
