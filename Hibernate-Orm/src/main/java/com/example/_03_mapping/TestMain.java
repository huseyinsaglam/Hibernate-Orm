package com.example._03_mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestMain {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");

		EntityManager manager = factory.createEntityManager();
		
	
		for(int i = 1 ; i<=1000; i++) {
			manager.getTransaction().begin();
			Supplier supplier = new Supplier();
			supplier.setSupplierId((long) i);
			supplier.setSupplierName("testName_"+i);
			supplier.setTotalCredit("total_credit_" +i*100);
			manager.persist(supplier);
			manager.getTransaction().commit();
		}
		
		manager.close();

	}

}
