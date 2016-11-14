package com.sxx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sxx.dao.UserMapper;
import com.sxx.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userMapper.getUserById(id);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userMapper.getAllUser();
	}

	@Override
	public void delUserById(int id) {
		// TODO Auto-generated method stub
		userMapper.delUserById(id);
	}

	
	
}
