package com.flm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flm.dao.AdminDAO;
import com.flm.model.Admin;



@Component
public class AdminService {
	
	@Autowired
	AdminDAO adminDAO;
	
	public String signupAdmin(String username,String password)
	{
		Admin admin = new Admin(username,password);
		
		return adminDAO.signup(admin);
		
	}
	
	public Admin loginAdmin(String username, String password)
	{
		
		Admin admin = adminDAO.findAdminByUsername(username);
		
		if(admin != null && admin.getPassword().equals(password))
		{
			return admin;
		}
		
		return null;
	}

}
