package com.example._04_composite_primary_key.embed;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestMain {

	public static void main(String[] args) {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		EntityManager manager = factory.createEntityManager();
		
		
		Customer customer = new Customer("huseyin");
		Customer customernew = new Customer("sebahattin");
		
		Address address = new Address("istanbul", "umraniye", "java mahallesi", "hibernate sokak");
		Address addressnew = new Address("istanbul", "uskudar", "react mahallesi", "javascript sokak");
		
		customer.setAddress(address);
		customernew.setAddress(addressnew);
		
		manager.getTransaction().begin();
		manager.persist(customer);
		manager.persist(customernew);
		manager.getTransaction().commit();
		manager.close();


	}

}
