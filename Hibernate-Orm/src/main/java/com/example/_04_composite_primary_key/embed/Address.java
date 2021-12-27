package com.example._04_composite_primary_key.embed;

import javax.persistence.Embeddable;

@Embeddable		// gomulebilir
public class Address {

	private String provinceName;
	private String districtName;
	private String adressLine1;
	private String adressLine2;
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getAdressLine1() {
		return adressLine1;
	}
	public void setAdressLine1(String adressLine1) {
		this.adressLine1 = adressLine1;
	}
	public String getAdressLine2() {
		return adressLine2;
	}
	public void setAdressLine2(String adressLine2) {
		this.adressLine2 = adressLine2;
	}
	public Address(String provinceName, String districtName, String adressLine1, String adressLine2) {
		super();
		this.provinceName = provinceName;
		this.districtName = districtName;
		this.adressLine1 = adressLine1;
		this.adressLine2 = adressLine2;
	}
	public Address() {
		super();
	}
	
	
	
	
}
