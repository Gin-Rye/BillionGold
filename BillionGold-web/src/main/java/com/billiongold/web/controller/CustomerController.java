package com.billiongold.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.billiongold.business.service.reference.CustomerService;
import com.billiongold.business.service.reference.ProductService;
import com.billiongold.domain.reference.Product;

@Controller("customerController")
public class CustomerController {
	
	@Autowired
	@Qualifier("customerService")
	private CustomerService customerService;
	
	@Autowired
	@Qualifier("productService")
	private ProductService productService;
	
	@RequestMapping("/customer/count")
	public int count() {
		int count = customerService.getAll().size();
		return count;
	}
	
	@RequestMapping("/product/create")
	@Transactional
	public String create(@ModelAttribute("product") Product product) {
		productService.create(product);
		return "product/createSuccess";
	}
}
