package com.billiongold.domain.reference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ref_customer_type")
public class CustomerType {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "specification")
	private String specification;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}
}
