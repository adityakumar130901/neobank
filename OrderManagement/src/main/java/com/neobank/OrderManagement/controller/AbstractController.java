package com.neobank.OrderManagement.controller;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.neobank.OrderManagement.dao.ItemDaoImpl;
import com.neobank.OrderManagement.data.Catalogue;
import com.neobank.OrderManagement.data.DiscountData;
import com.neobank.OrderManagement.data.InventoryData;
import com.neobank.OrderManagement.domain.Discount;
import com.neobank.OrderManagement.domain.Item;

@RestController
public class AbstractController {
	
	@Autowired
	Catalogue catalogue;
	
	@Autowired
	InventoryData inventoryData;
	
	@Autowired
	DiscountData discountData;
	
	@Autowired
	ItemDaoImpl itemDaoImpl;
	
	private static final Logger logger = LoggerFactory.getLogger(AbstractController.class);
	
	@PostConstruct
    public void addCatalogue() {
		Item item1 = new Item();
		item1.setId("001");
		item1.setName("Rolex");
		item1.setPrice(100);
		
		Item item2 = new Item();
		item2.setId("002");
		item2.setName("Michael Kors");
		item2.setPrice(80);
		
		Item item3 = new Item();
		item3.setId("003");
		item3.setName("Swatch");
		item3.setPrice(50);
		
		Item item4 = new Item();
		item4.setId("004");
		item4.setName("Casio");
		item4.setPrice(30);
		
		itemDaoImpl.addItem(item1);
		itemDaoImpl.addItem(item2);
		itemDaoImpl.addItem(item3);
		itemDaoImpl.addItem(item4);
		
		itemDaoImpl.addItemInventory(item1, 10);
		itemDaoImpl.addItemInventory(item2, 5);
		itemDaoImpl.addItemInventory(item3, 3);
		itemDaoImpl.addItemInventory(item4, 4);
		
		itemDaoImpl.addItemDiscount(item1, new Discount(3, 200));
		itemDaoImpl.addItemDiscount(item2, new Discount(2, 120));
		
		logger.info("Catalogue populated Successfully !!");
		
    }
	
}
