package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Store_location {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer Storeid;
private String Storename;
private String region;
private String city;
private String State;
private long pincode;
public Integer getStoreid() {
	return Storeid;
}
public void setStoreid(Integer storeid) {
	Storeid = storeid;
}
public String getStorename() {
	return Storename;
}
public void setStorename(String storename) {
	Storename = storename;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public long getPincode() {
	return pincode;
}
public void setPincode(long pincode) {
	this.pincode = pincode;
}
}
