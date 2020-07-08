package com.tts.eCommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tts.eCommerce.model.Product;
import com.tts.eCommerce.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product findByProduct(String product) {
		return productRepository.findByProduct(product);
	}
	
	public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }
 
    public Product getProduct(Long Id) {
        return productRepository.getProductById(Id);
//          .findById(id)
//          .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }
 
    public void save(Product product) {
         productRepository.save(product);
    } 
}
