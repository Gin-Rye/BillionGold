package com.billiongold.business.service.reference;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;

import com.billiongold.domain.reference.Customer;
import com.billiongold.domain.reference.CustomerType;
import com.ginrye.baseframework.java.test.BaseDBTest;

@ContextConfiguration("classpath:applicationContext.xml")
public class CustomerServiceTest extends BaseDBTest {
	
	@Autowired
	@Qualifier("customerService")
	private CustomerService customerService;
	
	@Override
	protected String[] getDataSets() {
		return new String[] {
			"reference/bg_ref_customer.xml"
		};
	}
	
	@Test
	public void create() {
		Customer customer1 = new Customer();
		customer1.setName("TT");
		customer1.setCode("TT");
		customer1.setCustomerType(CustomerType.PURCHASER);
		customer1.setAddress("TT");
		customerService.create(customer1);
		
		List<Customer> list = customerService.getAll();
		org.junit.Assert.assertTrue(list.size() == 3);
	}
	
	@Test
	public void getAll() {
		List<Customer> list = customerService.getAll();
		org.junit.Assert.assertTrue(list.size() == 2);
	}
	
	@Test
	public void getAllSupplier() {
		List<Customer> list = customerService.getAllSupplier();
		org.junit.Assert.assertTrue(list.size() == 1);
	}

	@Test
	public void getAllPurchaser() {
		List<Customer> list = customerService.getAllPurchaser();
		org.junit.Assert.assertTrue(list.size() == 1);
	}
}
