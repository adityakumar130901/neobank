package com.neobank.OrderManagement.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neobank.OrderManagement.dao.ItemDaoImpl;
import com.neobank.OrderManagement.domain.Discount;
import com.neobank.OrderManagement.domain.Item;

@Component
public class DiscountService {
		
	@Autowired
	ItemDaoImpl itemDao;
	
	public int applyDiscountIfApplicable(Item item, int quantity) {
	
		int price = 0;
		
		Discount discount = itemDao.fetchItemDiscount(item);
		
		while (discount != null && quantity !=0 && quantity >= discount.getQuantity()) {
			price = price + discount.getPrice();
			quantity = quantity - discount.getQuantity();
		}
		
		//add price of remainder of quantity
		price = price + quantity * item.getPrice(); 
		return price;
		}
	
}
