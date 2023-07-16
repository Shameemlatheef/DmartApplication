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

import com.masai.Exception.StockException;
import com.masai.Exception.Store_locationException;
import com.masai.Service.StockService;
import com.masai.model.Stock_Product_location;
import com.masai.model.Store_location;

@RestController
public class Stock_product_locationController {

	
	@Autowired
	private StockService stoService;
	
	
	@PostMapping("/addStock")
	ResponseEntity<Stock_Product_location> RegisterProduct(@RequestBody Stock_Product_location stock) throws StockException{    
	
		Stock_Product_location sto=stoService.AddStock(stock);
		return new ResponseEntity<Stock_Product_location>(sto,HttpStatus.CREATED);
		
	}
//	@PutMapping("/updateStock")
//	ResponseEntity<Stock_Product_location> Updatestock(@RequestBody Stock_Product_location Stock) throws StockException{
//		
//		Stock_Product_location Sto=stoService.UpdateStock(Stock);
//		return new ResponseEntity<Stock_Product_location>(Sto,HttpStatus.ACCEPTED);
//		
//	}
//	@DeleteMapping("/delete_stock")
//	ResponseEntity<Stock_Product_location> DeleteProduct(@RequestParam Integer Stockid) throws StockException{
//		
//		Stock_Product_location Stock=stoService.DeleteStock(Stockid);
//		return new ResponseEntity<Stock_Product_location>(Stock,HttpStatus.OK);
//		
//	}
//	@GetMapping("/view_stock")
//	ResponseEntity<Stock_Product_location> ViewStock(@RequestParam Integer Stockid) throws StockException{
//		
//		Stock_Product_location Sto=stoService.viewStock(Stockid);
//		return new ResponseEntity<Stock_Product_location>(Sto,HttpStatus.OK);
//		
//	}
//	@GetMapping("/viewall_stocks")
//	ResponseEntity<List<Stock_Product_location>> viewAllProduct() throws StockException{
//		
//		List<Stock_Product_location> Stocks=stoService.ViewAllstock();
//		return new ResponseEntity<List<Stock_Product_location>>(Stocks,HttpStatus.OK);
//		
//	}
	
	
	
}
