package com.example._07_lifecycle;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;

@MappedSuperclass @EntityListeners({HeritageListener.class})
public class Mother {
	
	private String nameField;
	
	@PrePersist
	public void prePersist() {
		System.out.println("direme oncesi");
	}

	public String getNameField() {
		return nameField;
	}

	public void setNameField(String nameField) {
		this.nameField = nameField;
	}
	
	

}
