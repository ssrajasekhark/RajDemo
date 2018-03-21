package com.example.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot.entity.User;
import com.example.boot.service.UserService;
import com.example.boot.utility.Utility;

@RestController
public class LoginController {
    @Autowired
	UserService userService;
    @Autowired
	Utility utility;
	
	

	@RequestMapping("/login")
	public User getUser(@RequestBody User user) {
		String username = user.getUsername();
		String password = user.getPassword();
		String generatedPassword = utility.encryptionPassword(password);
		String message = userService.findbyName(username, generatedPassword);
		return new User(username, message);
	}

}
