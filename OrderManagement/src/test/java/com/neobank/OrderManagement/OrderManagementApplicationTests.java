package com.neobank.OrderManagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.neobank.OrderManagement.service.PricingService;


@SpringBootTest
class OrderManagementApplicationTests {
	
	//@InjectMocks
	@Autowired
	PricingService pricingService;
	
	@Test
	public void testAddItemDiscount() throws Exception {

	}
	
	@Test
	public void testPricingService() throws Exception {
		List<String> listOfItems = new ArrayList<String>();
		listOfItems.add("001");
		listOfItems.add("001");
		listOfItems.add("001");
		int finalPrice = pricingService.fetchPrice(listOfItems);
		//System.out.println("Final Price: "+finalPrice);
		assertTrue(finalPrice == 200);
		
		listOfItems.add("001");
		//System.out.println("New Price: "+pricingService.fetchPrice(listOfItems));
		assertTrue(pricingService.fetchPrice(listOfItems) == 300);
	}

}
