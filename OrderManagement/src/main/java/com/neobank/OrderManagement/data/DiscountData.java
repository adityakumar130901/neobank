package com.neobank.OrderManagement.data;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.neobank.OrderManagement.domain.Discount;
import com.neobank.OrderManagement.domain.Item;

@Component
public class DiscountData {

	Map<Item, Discount> itemDiscountMap = new HashMap<>();
	
	public void addDiscount(Item item, Discount discount) {
		itemDiscountMap.put(item, discount);
		
	}
	
	public Discount fetchDiscount(Item item) {
		return itemDiscountMap.get(item);
	} 
	
	
}
