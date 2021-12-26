package com.example._02_relation.pojo;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestMain {

	public static void main(String[] args) {
		
		Department departmentA = new Department("Manager");
		departmentA.setEmployeeList(new ArrayList());
		
		Employee employee1 = new Employee("Buray","10000");
		employee1.setDepartment(departmentA);
		departmentA.getEmployeeList().add(employee1);
		
		Employee employee2 = new Employee("Kutay","7000");
		employee2.setDepartment(departmentA);
		departmentA.getEmployeeList().add(employee2);
		
		Employee employee3 = new Employee("Sacid","5000");
		employee3.setDepartment(departmentA);
		departmentA.getEmployeeList().add(employee3);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(departmentA);
		manager.getTransaction().commit();
		manager.close();

	}

}
