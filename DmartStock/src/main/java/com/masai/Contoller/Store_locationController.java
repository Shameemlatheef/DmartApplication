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

import com.masai.Exception.ProductException;
import com.masai.Exception.Store_locationException;
import com.masai.Service.Store_locationService;
import com.masai.model.Product;
import com.masai.model.Store_location;

@RestController
public class Store_locationController{

	@Autowired
	private Store_locationService sservice;
	
	
	@PostMapping("/addStore")
	ResponseEntity<Store_location> RegisterProduct(@RequestBody Store_location store) throws Store_locationException{
	
		Store_location sto=sservice.AddStore(store);
		return new ResponseEntity<Store_location>(sto,HttpStatus.CREATED);
		
	}
	@PutMapping("/updateStore")
	ResponseEntity<Store_location> UpdateProduct(@RequestBody Store_location Store) throws Store_locationException{
		
		Store_location Sto=sservice.UpdateStore(Store);
		return new ResponseEntity<Store_location>(Sto,HttpStatus.ACCEPTED);
		
	}
	@DeleteMapping("/delete_store")
	ResponseEntity<Store_location> DeleteProduct(@RequestParam Integer Storeid) throws Store_locationException{
		
		Store_location Store=sservice.DeleteStore(Storeid);
		return new ResponseEntity<Store_location>(Store,HttpStatus.OK);
		
	}
	@GetMapping("/view_store")
	ResponseEntity<Store_location> ViewStore(@RequestParam Integer Storeid) throws Store_locationException{
		
		Store_location Sto=sservice.viewStore(Storeid);
		return new ResponseEntity<Store_location>(Sto,HttpStatus.OK);
		
	}
	@GetMapping("/viewall_stores")
	ResponseEntity<List<Store_location>> viewAllrProduct() throws Store_locationException{
		
		List<Store_location> Stores=sservice.ViewAllstore();
		return new ResponseEntity<List<Store_location>>(Stores,HttpStatus.OK);
		
	}
	
	
}
