package com.neobank.OrderManagement.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neobank.OrderManagement.domain.CheckoutResponse;
import com.neobank.OrderManagement.handler.CheckoutHandler;

@RestController

public class CheckoutController extends AbstractController{
	
	@Autowired
	CheckoutHandler checkoutHandler;
	
	private static final Logger logger = LoggerFactory.getLogger(CheckoutController.class);
	
	@PostMapping("/check")
	public ResponseEntity<CheckoutResponse> check(@RequestBody List<String> listOfItems) throws Exception {
		
		try {
			CheckoutResponse response = checkoutHandler.handle(listOfItems);
			logger.info("Total Price: "+response.price);
			return ResponseEntity.ok(response);
	  }catch(Exception ex) {
		  logger.error("Error in Check API", ex);
		  //throw new Exception(ex);
		  return null;
	  	}
	  }
	
}
