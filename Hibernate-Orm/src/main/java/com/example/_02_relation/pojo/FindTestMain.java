package com.example._02_relation.pojo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.example.crud.pojo.TestData;

public class FindTestMain {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		EntityManager manager = factory.createEntityManager();
		
		
		Department department = manager.find(Department.class, 1L);
		
		manager.close();
		
		System.out.println("Department id "+ department.getDepartmentId() +" " + "Department adi " + department.getDepartmentName() );
		
		for(Employee emp : department.getEmployeeList()) {
			System.out.println(emp.getEmployeeId() +" "+ emp.getEmployeeName() +" "+ emp.getEmployeeSalary());
		} 
	}

}
