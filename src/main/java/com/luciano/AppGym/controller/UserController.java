package com.luciano.AppGym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.luciano.AppGym.entity.User;
import com.luciano.AppGym.repository.RoleRepository;
import com.luciano.AppGym.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	UserService userService;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/userForm")
	public String getUserForm(Model model) {
		model.addAttribute("userForm", new User());
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("roles",roleRepository.findAll());
		model.addAttribute("listTab","active");
		return "user-form/user-view";
	}	
}