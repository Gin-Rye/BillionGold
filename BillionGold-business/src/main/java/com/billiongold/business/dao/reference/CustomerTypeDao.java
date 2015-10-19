package com.billiongold.business.dao.reference;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.billiongold.domain.reference.CustomerType;
import com.ginrye.baseframework.java.base.dao.BaseDao;

@Repository
public class CustomerTypeDao extends BaseDao<CustomerType> {
	
	public List<CustomerType> getAllCustomerType() {
		Query query = em.createQuery("select o from CustomerType o");
		return (List<CustomerType>) query.getResultList();
	}
}
