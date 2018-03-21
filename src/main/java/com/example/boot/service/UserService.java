package com.example.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boot.entity.User;
import com.example.boot.repository.UserRepository;
import com.example.boot.utility.Utility;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	
	
	

	public String findbyName(String username, String password) {

		User user = userRepository.findByUsernameAndPassword(username, password);
		if (user != null) {
			return "welcome to ekart ";
		} else {
			return "Incorrect password please try again";
		}

		/*
		 * Map<String,String> m =new HashMap<>(); m.put("Admin",
		 * "e3afed0047b08059d0fada10f400c1e5");; m.put("Raja",
		 * "45afabe657829d76e90b78af1f1b82ec"); Iterator<Map.Entry<String, String>> itr
		 * = m.entrySet().iterator(); while(itr.hasNext()) { Map.Entry<String, String>
		 * entry=itr.next(); if(entry.getKey().equals(username) &&
		 * entry.getValue().equals(password)) { return "Welcome to Ekart page"; }
		 * 
		 * } return "Incorrect password.please try again";
		 */
	}
}
