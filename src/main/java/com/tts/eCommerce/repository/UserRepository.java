package com.tts.eCommerce.repository;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository 
	extends CrudRepository<User, Long> {

}
