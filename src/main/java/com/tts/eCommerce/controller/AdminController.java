package com.tts.eCommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tts.eCommerce.service.CartService;
import com.tts.eCommerce.service.OrderService;
import com.tts.eCommerce.service.ProductService;
import com.tts.eCommerce.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private ProductService productService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private CartService cartService;
	
	@GetMapping(value = "/products/new")
	public String newProduct() {
		return "newProduct";
	}


}
