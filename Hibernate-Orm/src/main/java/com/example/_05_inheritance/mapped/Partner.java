package com.example._05_inheritance.mapped;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Partner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long partnerId;
	private String partnerName;
	
	
	public Partner() {
		
	}
	
	public Partner(long partnerId, String partnerName) {
		this.partnerId = partnerId;
		this.partnerName = partnerName;
	}
	
	public long getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(long partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	
	

}
