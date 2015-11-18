package com.billiongold.business.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.billiongold.business.dao.user.UserDao;
import com.billiongold.domain.user.User;

@Service("userService")
public class UserService {
	
	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;
	
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
}
