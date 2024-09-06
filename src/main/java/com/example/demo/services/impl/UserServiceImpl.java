package com.example.demo.services.impl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	private  UserRepository repository;
	
	
	@Autowired
	public UserServiceImpl(UserRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public User saveUser(User user) {
    	String randomId = UUID.randomUUID().toString();
    	
    	user.setId(randomId);
        user.setRole("ROLE_USER");
		return repository.save(user);
	}

	@Override
	public User findByEmail(String email) {
		return repository.findByEmail(email).orElse(null);
	}

}
