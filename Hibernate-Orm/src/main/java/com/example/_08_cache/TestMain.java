package com.example._08_cache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestMain {

	public static void main(String[] args) {
		
		Frequent frequent = new Frequent();
		frequent.setFrequentId(1L);
		frequent.setFrequentName("Sýklýk Adý");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");

		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(frequent);
		manager.getTransaction().commit();
		manager.close();
	}

}
