package com.tts.eCommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.eCommerce.model.Product;

@Repository
public interface ProductRepository 
	extends CrudRepository<Product, Long> {

	public Product findByProduct(String product);
	public Product getProductById(Long Id);
}
