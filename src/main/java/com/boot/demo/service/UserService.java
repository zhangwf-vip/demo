package com.boot.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.demo.entity.User;

@Service
public class UserService {
	// @Autowired
	// private UserMapper userMapper;

	public List<User> findByName(String name) {
		// return userMapper.findUserByName(name);
		List<User> list = new ArrayList<>();
		return list;
	}

	public User insertUser(User user) {
		/*
		 * userMapper.insertUser(user); return user;
		 */
		return null;
	}

	public List<User> ListUser() {
		// return userMapper.ListUser();
		return null;
	}

	public int Update(User user) {
		// return userMapper.Update(user);
		return 0;
	}

	public int delete(int id) {
		// return userMapper.delete(id);
		return 0;
	}
}
