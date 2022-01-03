//package com.example._04_composite_primary_key.embeddedId;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//
//@Entity
//public class Project {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long projectId;
//	private String projectName;
//	
//	
//	public Project() {
//	
//	}
//	public Project(long projectId, String projectName) {
//		
//		this.projectId = projectId;
//		this.projectName = projectName;
//	}
//	public long getProjectId() {
//		return projectId;
//	}
//	public void setProjectId(long projectId) {
//		this.projectId = projectId;
//	}
//	public String getProjectName() {
//		return projectName;
//	}
//	public void setProjectName(String projectName) {
//		this.projectName = projectName;
//	}
//	
//	
//
//}
