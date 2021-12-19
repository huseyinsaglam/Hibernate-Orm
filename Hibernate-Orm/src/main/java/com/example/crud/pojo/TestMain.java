package com.example.crud.pojo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestMain {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		EntityManager manager = factory.createEntityManager();
	
		
		TestData testData = new TestData();
		testData.setDataName("hsaglam");
		testData.setDataValue(10.000);
		
		
		manager.getTransaction().begin();
		manager.persist(testData);
		manager.getTransaction().commit();
		System.out.println(testData);
		
		TestData data = manager.find(TestData.class, 1L);
		data.setDataName("test deneme");
		manager.getTransaction().begin();
		manager.merge(data);
		manager.getTransaction().commit();
		
		System.out.println(data);
		
		TestData data2 = manager.find(TestData.class, 1L);
		manager.getTransaction().begin();
		manager.remove(data2);
		manager.getTransaction().commit();
		manager.close();
		
		
		

	}

}
