package com.tts.eCommerce.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.eCommerce.model.Cart;
import com.tts.eCommerce.model.Product;

@Service
public class CartService {
	@Autowired
	private ProductService productService;
	
	public Cart addProductToCart(Cart cart, Long productId, Integer quantity) {
		Product productToAdd = productService.findById(productId);
		HashMap<Product, Integer> newLineItem = new HashMap<>();
		newLineItem.put(productToAdd, quantity);
		List<HashMap<Product, Integer>> cartLineItems = cart.getLineitems();
		cartLineItems.add(newLineItem);
		cart.setLineitems(cartLineItems);
		return cart;
	}
}
