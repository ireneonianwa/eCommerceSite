package com.tts.eCommerce.model;

import java.util.HashMap;
import java.util.List;

public class Cart {
	
	private List<HashMap<Product, Integer>> lineitems;
	

	public Cart() {
		
	}

	public Cart(List<HashMap<Product, Integer>> lineitems) {
		this.lineitems = lineitems;
	}

	public List<HashMap<Product, Integer>> getLineitems() {
		return lineitems;
	}

	public void setLineitems(List<HashMap<Product, Integer>> lineitems) {
		this.lineitems = lineitems;
	}

	
}
