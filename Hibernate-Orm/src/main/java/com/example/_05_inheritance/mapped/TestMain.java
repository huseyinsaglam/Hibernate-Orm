package com.example._05_inheritance.mapped;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestMain {

	public static void main(String[] args) {
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		EntityManager manager = factory.createEntityManager();
		
		Customer customer1 = new Customer(1L, "partnerName1", "customerName1");
		Customer customer2 = new Customer(2L, "partnerName2", "customerName2");
		
		manager.getTransaction().begin();
		manager.persist(customer1);
		manager.persist(customer2);
		manager.getTransaction().commit();
		manager.close();
	
	}

}
