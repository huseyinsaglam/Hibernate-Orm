package com.example._06_inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue(value = "BROTHER")
public class Brother extends Parent{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long brotherId;
	private boolean brotherCheck;
	
	
	public Brother() {

	} 
	
	public Brother(long parentId, String parentName, String parentValue, long brotherId, boolean brotherCheck) {
		super(parentId,parentName,parentValue);
		this.brotherId = brotherId;
		this.brotherCheck = brotherCheck;
	}

	public long getBrotherId() {
		return brotherId;
	}

	public void setBrotherId(long brotherId) {
		this.brotherId = brotherId;
	}

	public boolean isBrotherCheck() {
		return brotherCheck;
	}

	public void setBrotherCheck(boolean brotherCheck) {
		this.brotherCheck = brotherCheck;
	}
	
	
	
	

}
