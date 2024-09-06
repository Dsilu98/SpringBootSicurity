package com.example.demo.services;

import java.util.Optional;

import com.example.demo.entity.User;

public interface UserService {
	User saveUser(User user);
	User findByEmail(String email);
}
