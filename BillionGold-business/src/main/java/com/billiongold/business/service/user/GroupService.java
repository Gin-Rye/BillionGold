package com.billiongold.business.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.billiongold.business.dao.user.GroupDao;

@Service("groupService")
public class GroupService {
	
	@Autowired
	@Qualifier("groupDao")
	private GroupDao groupDao;
}
