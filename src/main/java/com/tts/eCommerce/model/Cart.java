package com.tts.eCommerce.model;

import java.util.HashMap;
import java.util.List;

public class Cart {
	
	private List<HashMap<Product, Integer>> lineitems;
	
	private int Quantity;

	public Cart() {
		
	}

	public Cart(List<HashMap<Product, Integer>> lineitems, int quantity) {
		this.lineitems = lineitems;
		Quantity = quantity;
	}

	public List<HashMap<Product, Integer>> getLineitems() {
		return lineitems;
	}

	public void setLineitems(List<HashMap<Product, Integer>> lineitems) {
		this.lineitems = lineitems;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	
	
	
	
}
