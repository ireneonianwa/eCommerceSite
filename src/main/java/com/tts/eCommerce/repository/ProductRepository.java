package com.tts.eCommerce.repository;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface ProductRepository 
	extends CrudRepository<Product, Long> {

}
