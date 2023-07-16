package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.ProductException;
import com.masai.Exception.StockException;
import com.masai.Repositary.ProductRepo;
import com.masai.Repositary.StockRepo;
import com.masai.Repositary.Store_locationRepo;
import com.masai.model.Product;
import com.masai.model.Stock_Product_location;
import com.masai.model.Store_location;
@Service
public class StockServiceimpl implements StockService{

	
	@Autowired
	private StockRepo storepo;
	@Autowired
	private ProductRepo perepo;
	@Autowired
	private Store_locationRepo srepo;
	@Override
	public Stock_Product_location AddStock(Stock_Product_location Stock) throws StockException {
		Product newprod=Stock.getProducts();
		Store_location newsto=Stock.getStoreid();
		List<Stock_Product_location> hh=storepo.findAll();
		Optional<Product> oldpro=perepo.findById(newprod.getProductid());
		Optional<Store_location> oldsto=srepo.findById(newsto.getStoreid());
		
		Stock_Product_location stocss=Stock;
		
		for(Stock_Product_location mm:hh) {
			if(mm.getStoreid()==newsto && mm.getProducts()==newprod) {
				Stock.setStockQuantity(Stock.getStockQuantity()+mm.getStockQuantity());
				perepo.save(oldpro.get());
				srepo.save(oldsto.get());
				storepo.save(mm);
				 stocss=mm;
			}
			else {
				perepo.save(newprod);
				srepo.save(newsto);
				storepo.save(Stock);
				 stocss=Stock;
			}
		}
		
		
		
		return stocss;
		
	
		
	}

	@Override
	public Stock_Product_location UpdateStock(Stock_Product_location stock) throws StockException {
		Product newprod=stock.getProducts();
		Store_location newsto=stock.getStoreid();
		List<Stock_Product_location> hh=storepo.findAll();
		Optional<Product> oldpro=perepo.findById(newprod.getProductid());
		Optional<Store_location> oldsto=srepo.findById(newsto.getStoreid());
		
		Stock_Product_location stocss=stock;
		
		for(Stock_Product_location mm:hh) {
			if(mm.getStoreid()==newsto && mm.getProducts()==newprod) {
				stock.setStockQuantity(stock.getStockQuantity()+mm.getStockQuantity());
				perepo.save(oldpro.get());
				srepo.save(oldsto.get());
				storepo.save(mm);
				 stocss=mm;
			}
			
		}
		
	
		
		return stocss;
		
	}

	@Override
	public Stock_Product_location DeleteStock(Integer id) throws StockException {
		Optional<Stock_Product_location> delsto=storepo.findById(id);
		if(delsto.isEmpty()) {
			throw new StockException("Stock not deleted or not found");
		}
		else {
			Stock_Product_location delstock=delsto.get();
					storepo.delete(delstock);
					return delstock;
		}
	}

	@Override
	public Stock_Product_location viewStock(Integer stockid) throws StockException {
		Optional<Stock_Product_location> view=storepo.findById(stockid);
		if(view.isEmpty()) {
			throw new StockException("Stock not found");
			
		}
		else {
			Stock_Product_location viewsto=view.get();
			return viewsto;
		}
	}

	@Override
	public List<Stock_Product_location> ViewAllstock() throws StockException {
		List<Stock_Product_location> all=storepo.findAll();
		if(all.isEmpty()) {
			throw new StockException("No Store found");
		}
		else
		return all;
	}

}
