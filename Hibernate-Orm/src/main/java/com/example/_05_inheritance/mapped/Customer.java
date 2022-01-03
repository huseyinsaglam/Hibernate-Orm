package com.example._05_inheritance.mapped;

import javax.persistence.Entity;

@Entity
public class Customer extends Partner{
	
	private String customerName;

	
	
	public Customer() {
		
	}

	public Customer(long partnerId, String partnerName, String customerName) {
		super(partnerId, partnerName);
		this.customerName = customerName;
		
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	
}
