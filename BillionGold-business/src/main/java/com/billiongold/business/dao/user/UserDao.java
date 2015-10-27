package com.billiongold.business.dao.user;

import org.springframework.stereotype.Repository;

import com.billiongold.domain.user.User;
import com.ginrye.baseframework.java.base.dao.BaseDao;

@Repository("userDao")
public class UserDao extends BaseDao<User> {

}
