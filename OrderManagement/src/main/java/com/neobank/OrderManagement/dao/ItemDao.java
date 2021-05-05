package com.neobank.OrderManagement.dao;

import com.neobank.OrderManagement.domain.Discount;
import com.neobank.OrderManagement.domain.Item;

public interface ItemDao {
		
	public Boolean addItem(Item item);
	
	public Boolean addItemDiscount(Item item, Discount discount);
	
	public Boolean addItemInventory(Item item, int quantity);
	
	public Item fetchItemById(String id);
	
	public Discount fetchItemDiscount(Item item);
	
}
