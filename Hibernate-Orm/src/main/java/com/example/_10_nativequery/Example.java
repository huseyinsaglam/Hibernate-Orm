package com.example._10_nativequery;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
public class Example implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long dataId;
	private String dataName;
	private double dataValue;
	
	

	public Example() {
		
	}

	public Example(long dataId, String dataName, double dataValue) {
	
		this.dataId = dataId;
		this.dataName = dataName;
		this.dataValue = dataValue;
	}
	
	public long getDataId() {
		return dataId;
	}
	public void setDataId(long dataId) {
		this.dataId = dataId;
	}
	public String getDataName() {
		return dataName;
	}
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}
	public double getDataValue() {
		return dataValue;
	}
	public void setDataValue(double dataValue) {
		this.dataValue = dataValue;
	}
	
	@Override
	public String toString() {
		return "Example [dataName=" + dataName + ", dataValue=" + dataValue + "]";
	}

	
	
	
	
	
	
}
