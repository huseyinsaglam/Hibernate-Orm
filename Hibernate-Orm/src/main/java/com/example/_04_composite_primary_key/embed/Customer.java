package com.example._04_composite_primary_key.embed;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String customerId;
	private String customerName;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Embedded // gomulen
	private Address address;
	
	
	public Customer() {

	}
	public Customer(String customerName) {
	
		this.customerName = customerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
}
