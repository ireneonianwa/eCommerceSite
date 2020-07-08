package com.tts.eCommerce.model;

import java.util.HashMap;

public class LineItem {
	
	private HashMap<Product, Integer> lineitem;
	
//	private Product product;
//	
//	private int selectedQuantity;
	
	private double totalPrice;

	public LineItem() {
		
	}

	public LineItem(HashMap<Product, Integer> lineitem, double totalPrice) {
		this.lineitem = lineitem;
		this.totalPrice = totalPrice;
	}

	public HashMap<Product, Integer> getLineitem() {
		return lineitem;
	}

	public void setLineitem(HashMap<Product, Integer> lineitem) {
		this.lineitem = lineitem;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	
	
	
}
