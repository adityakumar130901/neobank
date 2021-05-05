package com.neobank.OrderManagement.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neobank.OrderManagement.dao.ItemDaoImpl;
import com.neobank.OrderManagement.domain.Item;
import com.neobank.OrderManagement.utils.UtilService;

@Component
public class PricingService {

	@Autowired
	ItemDaoImpl itemDao;
	
	@Autowired
	DiscountService discountService;
	
	@Autowired
	UtilService utilService;
	
	private static final Logger logger = LoggerFactory.getLogger(PricingService.class);
	
	public int fetchPrice(List<String> items){
		
		Map<Item, Integer> itemCountMap;
		int totalPrice = 0;
		
		itemCountMap = utilService.getItemCounterMap(items);
		
		for (Map.Entry mapElement : itemCountMap.entrySet()) {
            Item item = (Item) mapElement.getKey();
            int count = (int)mapElement.getValue();
            
            int discountedPrice = discountService.applyDiscountIfApplicable(item, count);
            
            logger.info("Item: "+item.getName()+" , FinalPrice: "+discountedPrice);
            
            totalPrice = totalPrice + discountedPrice; 
  
        }
		
		logger.info("Cart Value: "+totalPrice);
		return totalPrice;
	}
	
}
