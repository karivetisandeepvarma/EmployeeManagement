package com.flm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.flm.model.Admin;
import com.flm.service.AdminService;

import jakarta.servlet.http.HttpServletRequest;


@Controller
@Component
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	@PostMapping("/signup")
	public String signup(HttpServletRequest request,Model model)
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		adminService.signupAdmin(username, password);
		
		model.addAttribute("username",username);
		model.addAttribute("password",password);
		
		return "signupsuccess";
	}
	
	@PostMapping("/login")
	public String login(HttpServletRequest request)
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Admin admin = adminService.loginAdmin(username,password);
		
		if(admin != null)
		{
			return "redirect:/flm/employees";
		}
		else
		{
			return "redirect:/flm/";
		}
		
	}
	
	

}
