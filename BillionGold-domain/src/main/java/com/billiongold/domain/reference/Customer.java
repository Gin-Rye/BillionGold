package com.billiongold.domain.reference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ref_customer")
public class Customer {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "type_id")
	private CustomerType customerType;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "telephone")
	private String telephone;
	
	@Column(name = "fax")
	private String fax;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "website")
	private String website;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
}
