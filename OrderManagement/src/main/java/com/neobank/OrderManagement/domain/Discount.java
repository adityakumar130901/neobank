package com.neobank.OrderManagement.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter 
public class Discount {
	private int quantity;
	private int price;
	
	public Discount(int quantity, int price) {
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int i) {
		this.price = i;
	}
}
