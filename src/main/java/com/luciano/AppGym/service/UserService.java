package com.luciano.AppGym.service;

import javax.validation.Valid;

import com.luciano.AppGym.entity.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;

}
