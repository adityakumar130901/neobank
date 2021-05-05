package com.neobank.OrderManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neobank.OrderManagement.dao.ItemDaoImpl;
import com.neobank.OrderManagement.domain.Item;

@Component
public class ItemIdVerificationService {
	
	@Autowired
	ItemDaoImpl itemDao;
	
	public boolean isValidCart(List<String> listOfItems) {
		
		for (String itemId : listOfItems) {
			Item item = itemDao.fetchItemById(itemId);
			if (item == null)
				return false;
		}
		
		return true;
	}
	
}
