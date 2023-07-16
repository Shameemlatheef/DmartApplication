package com.masai.Service;

import java.util.List;

import com.masai.Exception.ProductException;
import com.masai.Exception.Store_locationException;
import com.masai.model.Product;
import com.masai.model.Store_location;

public interface Store_locationService {
	public Store_location AddStore(Store_location Store) throws Store_locationException;
	public Store_location UpdateStore(Store_location store)throws Store_locationException;
	public Store_location DeleteStore(Integer id)throws Store_locationException;
	public Store_location viewStore(Integer proid)throws Store_locationException;
	public List<Store_location> ViewAllstore()throws Store_locationException;
}
