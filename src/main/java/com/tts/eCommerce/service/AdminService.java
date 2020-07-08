package com.tts.eCommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.tts.eCommerce.repository.RoleRepository;

@Service
public class AdminService {
		
//		@Autowired
//		private RoleRepository roleRepository;
		
	    @PreAuthorize("hasRole(@role.ADMIN)")
	    public boolean ensureAdmin() {
	        return true;
	    }
		
}
