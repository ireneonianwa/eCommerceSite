package com.tts.eCommerce.repository;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface RoleRepository 
	extends CrudRepository<Role, Long> {

}
