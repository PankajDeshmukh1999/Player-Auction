package com.Registration.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Registration.entity.User;
import com.Registration.repository.UserRepository;

@Service	
public class UserService {

	@Autowired
	private UserRepository repository;

	public User savaData(User user) {
		return repository.save(user);
	}

	public User byUser(String userName) {
		return repository.findByUserName(userName);
	}

	public User fetchUserBynameAndPassword(String userName, String password) {
		return repository.findByUserNameAndPassword(userName,password);
	}
	
	public List<User> getAll(){
		return repository.findAll();
	}

}
