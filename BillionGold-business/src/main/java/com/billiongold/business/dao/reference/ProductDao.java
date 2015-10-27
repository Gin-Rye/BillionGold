package com.billiongold.business.dao.reference;

import org.springframework.stereotype.Repository;

import com.billiongold.domain.reference.Product;
import com.ginrye.baseframework.java.base.dao.BaseDao;

@Repository("productDao")
public class ProductDao extends BaseDao<Product> {

}
