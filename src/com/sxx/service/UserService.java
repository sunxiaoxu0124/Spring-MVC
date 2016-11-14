package com.sxx.service;

import java.util.List;

import com.sxx.entity.User;

public interface UserService {
	
	public User getUserById(int id);
	
	public List<User> getAllUser();
	
	public void delUserById(int id);
	
}
