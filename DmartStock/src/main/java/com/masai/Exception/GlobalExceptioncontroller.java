package com.masai.Exception;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.masai.model.Product;

@ControllerAdvice
public class GlobalExceptioncontroller {

	
	@ExceptionHandler(ProductException.class)
    public ResponseEntity<Myerrordetails> getProductException(ProductException ae,WebRequest req){
		
		Myerrordetails mr=new Myerrordetails(LocalDateTime.now(), ae.getMessage(), req.getDescription(false));
		return new ResponseEntity<Myerrordetails>(mr, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Store_locationException.class)
    public ResponseEntity<Myerrordetails> getStore_locationException(Store_locationException ae,WebRequest req){
		
		Myerrordetails mr=new Myerrordetails(LocalDateTime.now(), ae.getMessage(), req.getDescription(false));
		return new ResponseEntity<Myerrordetails>(mr, HttpStatus.BAD_REQUEST);
	}
}
