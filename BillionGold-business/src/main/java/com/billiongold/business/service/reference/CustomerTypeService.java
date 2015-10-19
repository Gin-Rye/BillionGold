package com.billiongold.business.service.reference;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billiongold.business.dao.reference.CustomerTypeDao;
import com.billiongold.domain.reference.CustomerType;

@Service
public class CustomerTypeService {
	
	@Autowired
	private CustomerTypeDao customerTypeDao;
	
	public List<CustomerType> getAllCustomerType() {
		return customerTypeDao.getAllCustomerType();
	}
	
	@Transactional
	public void create(CustomerType customerType) {
		customerTypeDao.create(customerType);
	}
}
