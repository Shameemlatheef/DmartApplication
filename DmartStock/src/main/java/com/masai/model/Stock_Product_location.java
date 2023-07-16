package com.masai.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Stock_Product_location {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer StockNo;


@OneToOne
@JoinColumn(name = "product",referencedColumnName = "Productid")
private Product products;
@OneToOne
@JoinColumn(name = "Location",referencedColumnName = "Storeid")
private Store_location Storeid;
private Integer StockQuantity;
private LocalDate updated_date;
private LocalDate Created_date;



public Integer getStockNo() {
	return StockNo;
}



public void setStockNo(Integer stockNo) {
	StockNo = stockNo;
}



public Product getProducts() {
	return products;
}



public void setProducts(Product products) {
	this.products = products;
}



public Store_location getStoreid() {
	return Storeid;
}



public void setStoreid(Store_location storeid) {
	Storeid = storeid;
}



public Integer getStockQuantity() {
	return StockQuantity;
}



public void setStockQuantity(Integer stockQuantity) {
	StockQuantity = stockQuantity;
}



public LocalDate getUpdated_date() {
	return updated_date;
}



public void setUpdated_date(LocalDate updated_date) {
	this.updated_date = updated_date;
}



public LocalDate getCreated_date() {
	return Created_date;
}



public void setCreated_date(LocalDate created_date) {
	Created_date = created_date;
}



public Stock_Product_location() {
	super();
}



public Stock_Product_location(Integer stockNo, Product products, Store_location storeid, Integer stockQuantity,
		LocalDate updated_date, LocalDate created_date) {
	super();
	StockNo = stockNo;
	this.products = products;
	Storeid = storeid;
	StockQuantity = stockQuantity;
	this.updated_date = updated_date;
	Created_date = created_date;
}




}
