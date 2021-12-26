package com.example._02_relation.pojo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class FindTestMainRelation {

	public static void main(String[] args) {
		
	    EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		EntityManager manager = factory.createEntityManager();
		
		String jpql = "select employee from Employee employee where employee.department.departmentId = 51 ";
		TypedQuery<Employee> employee= manager.createQuery(jpql, Employee.class);
		List<Employee> emp = employee.getResultList();
		
		
		
		for(Employee emp1 : emp) {
			System.out.println(emp1.getEmployeeId() + " " + emp1.getEmployeeName() +" "+ emp1.getEmployeeSalary());
		}
		
	
	}

}
