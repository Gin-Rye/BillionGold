package com.billiongold.business.dao.user;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.billiongold.domain.user.User;
import com.ginrye.baseframework.java.base.dao.BaseDao;

@Repository("userDao")
public class UserDao extends BaseDao<User> {
	
	public User findByUsername(String username) {
		Query query = em.createQuery("select o from User o where o.username = :username");
		query.setParameter("username", username);
		User user = (User) query.getSingleResult();
		return user;
	}
}
