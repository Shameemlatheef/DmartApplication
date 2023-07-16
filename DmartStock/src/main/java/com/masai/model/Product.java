package com.masai.model;

import java.time.LocalDate;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
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
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer Productid;
private String product_name;
private String category;
private LocalDate Expiry_date;
public Integer getProductid() {
	return Productid;
}
public void setProductid(Integer productid) {
	Productid = productid;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public LocalDate getExpiry_date() {
	return Expiry_date;
}
public void setExpiry_date(LocalDate expiry_date) {
	Expiry_date = expiry_date;
}
public Product(Integer productid, String product_name, String category, LocalDate expiry_date) {
	super();
	Productid = productid;
	this.product_name = product_name;
	this.category = category;
	Expiry_date = expiry_date;
}
public Product() {
	super();
}
}
