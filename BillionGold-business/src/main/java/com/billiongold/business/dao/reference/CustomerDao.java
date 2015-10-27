package com.billiongold.business.dao.reference;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.billiongold.domain.reference.Customer;
import com.billiongold.domain.reference.CustomerType;
import com.ginrye.baseframework.java.base.dao.BaseDao;

@Repository("customerDao")
public class CustomerDao extends BaseDao<Customer> {
	
	public List<Customer> getAllSupplier() {
		return getCustomerByType(CustomerType.SUPPLIER);
	}

	public List<Customer> getAllPurchaser() {
		return getCustomerByType(CustomerType.PURCHASER);
	}
	
	private List<Customer> getCustomerByType(CustomerType customerType) {
		Query query = em.createQuery("select o from Customer o where o.customerType = :customerType");
		query.setParameter("customerType", customerType);
		return (List<Customer>) query.getResultList();
	}
}
