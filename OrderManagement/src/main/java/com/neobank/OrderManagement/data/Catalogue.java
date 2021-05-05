package com.neobank.OrderManagement.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.neobank.OrderManagement.domain.Item;

import lombok.Getter;

@Getter
@Component
public class Catalogue {

	private List<Item> listOfItem = new ArrayList<Item>();
	private Map<String, Item> itemIdItemMap = new HashMap<>();

	public void addItem(Item item) {
		listOfItem.add(item);
		itemIdItemMap.put(item.getId(), item);
	}

	public List<Item> getListOfItem() {
		return listOfItem;
	}
	
	public Item getItemByItemId(String id) {
		return itemIdItemMap.get(id);
	}
	
}
