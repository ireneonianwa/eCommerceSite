package com.tts.eCommerce.service;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;


@Service
public class AdminService {
		
//		@Autowired
//		private RoleRepository roleRepository;
		
	    @PreAuthorize("hasRole(@role.ADMIN)")
	    public boolean ensureAdmin() {
	        return true;
	    }
		
}
