package com.example._07_lifecycle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestMain {

	public static void main(String[] args) {
		
		Kid kid = new Kid();
		kid.setNameField("Cocuk");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		EntityManager manager = factory.createEntityManager();
		
		
		manager.getTransaction().begin();
		manager.persist(kid);
		manager.getTransaction().commit();
		manager.close();
		
		
	}

}
