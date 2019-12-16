package com.luciano.crud.service;

import javax.validation.Valid;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.luciano.crud.dto.ChangePasswordForm;
import com.luciano.crud.entity.User;
import com.luciano.crud.exception.UsernameOrIdNotFound;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;

	public User getUserById(Long id) throws Exception;
	
	public User updateUser(User user) throws Exception;
	
	public void deleteUser(Long id) throws UsernameOrIdNotFound;
	
	public User changePassword(ChangePasswordForm form) throws Exception;
}
