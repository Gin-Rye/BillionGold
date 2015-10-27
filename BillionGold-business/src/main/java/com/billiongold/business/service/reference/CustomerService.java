package com.billiongold.business.service.reference;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.billiongold.business.dao.reference.CustomerDao;
import com.billiongold.domain.reference.Customer;

@Service("customerService")
public class CustomerService {
	
	@Autowired
	@Qualifier("customerDao")
	private CustomerDao customerDao;
	
	public void create(Customer customer) {
		customerDao.create(customer);
	}
	
	public List<Customer> getAll() {
		return customerDao.getAll();
	}
	
	public List<Customer> getAllSupplier() {
		return customerDao.getAllSupplier();
	}
	
	public List<Customer> getAllPurchaser() {
		return customerDao.getAllPurchaser();
	}
}
