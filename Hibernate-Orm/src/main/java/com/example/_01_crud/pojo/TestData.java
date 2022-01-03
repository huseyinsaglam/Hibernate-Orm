package com.example._01_crud.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TESTDATA")
public class TestData implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long dataId;
	private String dataName;
	private double dataValue;
	
	

	public TestData() {
		
	}

	public TestData(String dataName, double dataValue) {
	
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
		return "TestData [dataName=" + dataName + ", dataValue=" + dataValue + "]";
	}

	
	
	
	
	
	
}
