package com.example._06_inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestMain {

	public static void main(String[] args) {
		

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		EntityManager manager = factory.createEntityManager();
		
		Brother brother1 = new Brother(1L,"parentBrotherName1", "parentBrotherValue1", 2L, true);
		Brother brother2 = new Brother(3L,"parentBrotherName2", "parentBrotherValue2", 4L, false);
		
		Sister sister1 = new Sister(5L,"parentSisterName1", "parentSisterValue1", 6L, true);
		Sister sister2 = new Sister(7L,"parentSisterName2", "parentSisterValue2", 8L, false);
		
		manager.getTransaction().begin();
		manager.persist(brother1);
		manager.persist(brother2);
		manager.persist(sister1);
		manager.persist(sister2);
		manager.getTransaction().commit();
		manager.close();
	}

}
