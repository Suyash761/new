package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import com.lti.exception.LoginException;
import com.lti.modelEntity.AdminLogin;
import com.lti.repo.AdminRepository;


@Service
public class AdminLoginService {
	
	@Autowired
	private AdminRepository adminRepository;

//	public void add(AdminLogin adminLogin) {
//		adminRepository.add(adminLogin);
//	}

public AdminLogin login(String username,String password) throws LoginException {
	try {
	AdminLogin adminLogin=adminRepository.fetch(username,password);
	return adminLogin;
	}catch(Exception e) {
		throw new LoginException("Invalid credentials");
	}
}
}


	
