package com.example._07_lifecycle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kid extends Mother{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idField;

	
	public Kid() {
		
	}

	public long getIdField() {
		return idField;
	}

	public void setIdField(long idField) {
		this.idField = idField;
	}
	
	

}
