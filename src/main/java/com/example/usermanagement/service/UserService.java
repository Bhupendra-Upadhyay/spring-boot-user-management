package com.example.usermanagement.service;

import java.util.List;

import com.example.usermanagement.model.User;

public interface UserService {
	 User createUser(User user);
	 List<User> getAllUsers();
	 User getUserById(Long id);
	 User updateUser(Long id, User user);
	 String deleteUser(Long id);
}
