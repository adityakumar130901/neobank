package com.neobank.OrderManagement.data;

import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.neobank.OrderManagement.domain.Item;

@Component
public class InventoryData {

	Map<Item, Integer> itemQuantityMap = new HashMap<Item, Integer>();
	
	public void addItemInventory(Item item, int quantity) {
		itemQuantityMap.put(item, quantity);
		
	}
	
	public Map<Item, Integer> getInventoryData(){
		return itemQuantityMap;
	}
	
	
}
