package com.billiongold.business.service.reference;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.billiongold.domain.reference.CustomerType;
import com.ginrye.baseframework.java.test.BaseDBTest;

@ContextConfiguration("classpath:testApplicationContext.xml")
public class CustomerTypeServiceTest extends BaseDBTest {
	
	@Autowired
	private CustomerTypeService customerTypeService;
	
	@Test
	public void getAllCustomerType() throws Exception {
		
		List<CustomerType> typeList = customerTypeService.getAllCustomerType();
		org.junit.Assert.assertTrue(typeList.size() == 2);
	}
	
	@Test
	public void create() {
		CustomerType type = new CustomerType();
		type.setName("测试");
		type.setSpecification("test");
		customerTypeService.create(type);
		
		List<CustomerType> typeList = customerTypeService.getAllCustomerType();
		org.junit.Assert.assertTrue(typeList.size() == 3);
	}

	@Override
	protected String[] getDataSets() {
		return new String[] {
			"ref_customer_type.xml"	
		};
	}
}
