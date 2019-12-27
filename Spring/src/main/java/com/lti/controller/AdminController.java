package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.modelEntity.AdminLogin;
import com.lti.service.AdminLoginService;


@Controller
public class AdminController {

	@Autowired
	private AdminLoginService adminLoginService;
	
	/*
	public String add(AdminLogin adminLogin) {
		
		adminLoginService.add(adminLogin);
		return "adminDashboard.jsp";
	}*/
	
	@RequestMapping(path = "/adminLogin.lti" , method = RequestMethod.POST)
	public String check(@RequestParam("username") String username, @RequestParam("password") String password, ModelMap model) {
		try {
			AdminLogin adminlogin = adminLoginService.login(username,password);
			//map.put("loggedInAdmin", adminlogin);
			return "adminDashboard.jsp";
		} catch (Exception e) {
			model.put("message", "Invalid credentials");
			return "AdminLogin.jsp";
			}
	}
}
	

