package com.neobank.OrderManagement.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neobank.OrderManagement.data.InventoryData;
import com.neobank.OrderManagement.domain.CheckoutResponse;
import com.neobank.OrderManagement.exceptions.InvalidIdException;
import com.neobank.OrderManagement.service.ItemIdVerificationService;
import com.neobank.OrderManagement.service.PricingService;
import com.neobank.OrderManagement.constants.*;

@Component
public class CheckoutHandler extends AbstractServiceHandler{

	@Autowired
	ItemIdVerificationService itemIdVerificationService;
	
	@Autowired
	PricingService pricingService;
	
	@Autowired
	InventoryData inventoryData;
	
	public CheckoutResponse handle(List<String> listOfItems) {
		
		boolean isValidCart = itemIdVerificationService.isValidCart(listOfItems);
		
		if (isValidCart == false) {
			throw new InvalidIdException(ErrorMessages.INVALID_ITEM);
		}
		
		int totalPrice = pricingService.fetchPrice(listOfItems);
		
		CheckoutResponse response = new CheckoutResponse();
		response.price = totalPrice;
		
        try {
            
        } catch (Exception e) {
            
        }
		
       return response;
    }
	
}

