package com.neobank.OrderManagement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neobank.OrderManagement.data.Catalogue;
import com.neobank.OrderManagement.data.DiscountData;
import com.neobank.OrderManagement.data.InventoryData;
import com.neobank.OrderManagement.domain.Discount;
import com.neobank.OrderManagement.domain.Item;

@Component
public class ItemDaoImpl implements ItemDao{
	
	@Autowired
	Catalogue catalogue;
	
	@Autowired
	InventoryData inventoryData;
	
	@Autowired
	DiscountData discountData;


	@Override
	public Boolean addItem(Item item) {
		catalogue.addItem(item);
		return true;
	}

	@Override
	public Boolean addItemDiscount(Item item, Discount discount) {
		discountData.addDiscount(item, discount);
		return null;
	}

	@Override
	public Boolean addItemInventory(Item item, int quantity) {
		inventoryData.addItemInventory(item, quantity);
		return true;
	}

	@Override
	public Item fetchItemById(String id) {
		return catalogue.getItemByItemId(id);
	}
	
	@Override
	public Discount fetchItemDiscount(Item item) {
		return discountData.fetchDiscount(item);
	}

}
