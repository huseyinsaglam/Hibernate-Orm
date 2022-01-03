package com.example._06_inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "PARENT_TYPE")
public abstract class Parent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long parentId;
	private String parentName;
	private String parentValue;

	public Parent() {

	}

	public Parent(long parentId, String parentName, String parentValue) {

		this.parentId = parentId;
		this.parentName = parentName;
		this.parentValue = parentValue;
	}
	
	

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentValue() {
		return parentValue;
	}

	public void setParentValue(String parentValue) {
		this.parentValue = parentValue;
	}

	
}
