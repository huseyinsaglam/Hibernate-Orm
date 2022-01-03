package com.example._06_inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue(value = "SISTER")
public class Sister extends Parent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long sisterId;
	private boolean sisterCode;
	
	
	public Sister() {

	} 
	
	public Sister(long parentId, String parentName, String parentValue,long sisterId, boolean sisterCode) {
		super(parentId, parentName, parentValue);
		this.sisterId = sisterId;
		this.sisterCode = sisterCode;
	}

	public long getSisterId() {
		return sisterId;
	}

	public void setSisterId(long sisterId) {
		this.sisterId = sisterId;
	}

	public boolean getSisterCode() {
		return sisterCode;
	}

	public void setSisterCode(boolean sisterCode) {
		this.sisterCode = sisterCode;
	}
	
	
	
	
}
