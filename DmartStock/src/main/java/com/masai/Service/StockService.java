package com.masai.Service;

import java.util.List;

import com.masai.Exception.StockException;
import com.masai.Exception.Store_locationException;
import com.masai.model.Stock_Product_location;
import com.masai.model.Store_location;

public interface StockService {
	public Stock_Product_location AddStock(Stock_Product_location Stock) throws StockException;
	public Stock_Product_location UpdateStock(Stock_Product_location stock)throws StockException;
	public Stock_Product_location DeleteStock(Integer id)throws StockException;
	public Stock_Product_location viewStock(Integer stockid)throws StockException;
	public List<Stock_Product_location> ViewAllstock()throws StockException;
}
