package com.arun.user.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arun.user.management.model.User;
import com.arun.user.management.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}
}
