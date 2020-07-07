package com.tts.eCommerce.repository;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface OrderRepository 
	extends CrudRepository<Order, Long> {

}
