package com.billiongold.business.service.reference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.billiongold.business.dao.reference.ProductDao;
import com.billiongold.domain.reference.Product;

@Service
public class ProductService {
	
	@Autowired
	@Qualifier("productDao")
	private ProductDao productDao;
	
	public void create(Product product) {
		productDao.create(product);
	}
}
