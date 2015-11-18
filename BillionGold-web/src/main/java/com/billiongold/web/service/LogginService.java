package com.billiongold.web.service;

import org.codehaus.plexus.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.billiongold.business.service.user.UserService;
import com.billiongold.domain.user.User;

@Service("logginService")
public class LogginService {
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	public boolean checkPassword(User user, String password) {
		return StringUtils.equals(user.getPassword(), password);
	}
}
