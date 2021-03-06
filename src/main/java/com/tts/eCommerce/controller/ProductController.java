package com.tts.eCommerce.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tts.eCommerce.model.Product;
import com.tts.eCommerce.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/storefront/products/{productId}")
	public String show(@PathVariable Long id, Model model) {
	  Product product = productService.findById(id);
	  model.addAttribute(product);
	  return "storefront/product";
	}

	@RequestMapping(value = {"/storefront/products/new", "/storefront/products/{productId}/edit"}, method = {RequestMethod.POST, RequestMethod.PUT })
	public String createOrUpdate(@Valid Product product) {
	  productService.save(product);
	  return "redirect:/storefront/products/" + product.getId();
	}
	
	@RequestMapping(value = {"/admin/products/new", "/admin/products/{productId}/edit"}, method = {RequestMethod.POST, RequestMethod.PUT })
	public String createUpdate(@Valid Product product) {
	  productService.save(product);
	  return "redirect:/admin/products/" + product.getId();
	}

}
