package com.example._08_cache;

import javax.persistence.Cache;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SecondLevelCacheMain {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		Cache cache = factory.getCache();
		
		EntityManager manager = factory.createEntityManager();
			
		Frequent frequent = manager.find(Frequent.class, 1L);
		System.out.println(frequent);
		System.out.println("Zulada mý : " + cache.contains(Frequent.class, 1L));
		
		
		manager.close();

	}

}
