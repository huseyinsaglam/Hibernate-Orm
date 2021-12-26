package com.example._03_mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "SUPPLIER", indexes = {
		@Index (name = "mysupplerId", columnList = "supplierId"),
		@Index (name = "mysuppler", columnList = "supplierName,totalCredit") // ilk once supplier_name gore index yapar supplier_name ayný olanlari supplier_total_credit gore indexleme yapar 
})
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "supplier_id")
	private Long supplierId;
	@Column(name = "supplier_name" , length = 80, nullable = true  , unique = true)
	private String supplierName;
	@Column(name = "supplier_total_credit")
	private String totalCredit;
	
	
	
	public Supplier() {
		
	}
	
	

	public Supplier(Long supplierId, String supplierName, String totalCredit) {
		   
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.totalCredit = totalCredit;
	}



	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", totalCredit=" + totalCredit
				+ "]";
	}
	
	public Long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getTotalCredit() {
		return totalCredit;
	}
	public void setTotalCredit(String totalCredit) {
		this.totalCredit = totalCredit;
	}
	
	

}
