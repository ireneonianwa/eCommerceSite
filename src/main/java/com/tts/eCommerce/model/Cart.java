package com.tts.eCommerce.model;

import java.util.HashMap;

public class Cart {
	
	private HashMap<Product, Integer> lineitem;
	
	private int Quantity;

	public Cart() {
		
	}

	public Cart(HashMap<Product, Integer> lineitem, int quantity) {
		this.lineitem = lineitem;
		Quantity = quantity;
	}

	public HashMap<Product, Integer> getLineitem() {
		return lineitem;
	}

	public void setLineitem(HashMap<Product, Integer> lineitem) {
		this.lineitem = lineitem;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	
	
}
