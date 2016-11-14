package com.sxx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sxx.service.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;

	@RequestMapping("/user/{id}")
	public String getUser(@PathVariable int id, ModelMap model) {
		if (id == -1) {
			model.addAttribute("user", userServiceImpl.getAllUser());
		} else {
			model.addAttribute("user", userServiceImpl.getUserById(id));
		}
		System.out.println("User List ...");
		return "userList";
	}

	@RequestMapping("/user/{id}/del")
	public String delUser(@PathVariable int id) {
		userServiceImpl.delUserById(id);
		return "delSucess";
	}
}
