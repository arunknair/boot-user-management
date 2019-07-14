package com.arun.user.management.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.user.management.dao.UserDAO;
import com.arun.user.management.model.User;
import com.arun.user.management.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	public List<User> getUsers() {
		return Arrays.asList(new User(1, "arun", "a@a"));
	}
}
