package com.sxx.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sxx.entity.User;

@Component
public interface UserMapper {

	public User getUserById(int id);
	
	public List<User> getAllUser();
	
	public void delUserById(int id);

}
