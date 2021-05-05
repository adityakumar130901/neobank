package com.neobank.OrderManagement.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neobank.OrderManagement.dao.ItemDaoImpl;
import com.neobank.OrderManagement.domain.Item;

@Component
public class UtilService {

	@Autowired
	ItemDaoImpl itemDao;
	
	public Map<Item, Integer>  getItemCounterMap(List<String> itemList){
		Map<Item, Integer> itemCountMap = new HashMap<>();
		
		for (String itemId : itemList) {
			Item item = itemDao.fetchItemById(itemId);
			itemCountMap.put(item, itemCountMap.getOrDefault(item, 0)+1);
		}
		
		return itemCountMap;
	}
	
}
