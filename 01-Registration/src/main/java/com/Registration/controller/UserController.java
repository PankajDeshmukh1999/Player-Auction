package com.Registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Registration.entity.User;
import com.Registration.service.UserService;

@RestController
@CrossOrigin(origins = "*")

public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/user")

	public User saveDataRegi(@RequestBody User user) throws Exception {
		String tempusername = user.getUserName();
		if (tempusername != null && !"".equals(tempusername)) {
			User userObj = service.byUser(tempusername);
			if (userObj != null) {
				throw new Exception("user with " + tempusername + " is already exist");
			}
		}
		User userObj = null;
		userObj = service.savaData(user);
		return userObj;
	}

	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempUser = user.getUserName();
		String tempPassword = user.getPassword();
		User userObj = null;

		if (tempUser != null && tempPassword != null) {
			userObj = service.fetchUserBynameAndPassword(tempUser, tempPassword);
		}
		if (userObj == null) {
			throw new Exception("Bad credentials");
		}
		return userObj;

	}
	
	@GetMapping("/getAllData")
	public ResponseEntity<List<User>> getAll(){
		return ResponseEntity.ok(service.getAll());
	}


}
