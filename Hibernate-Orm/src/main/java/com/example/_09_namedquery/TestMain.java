package com.example._09_namedquery;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TestMain {

	public static void main(String[] args) {
		
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
			
			EntityManager manager = factory.createEntityManager();
		
			
			Example example1 = new Example(1,"exp1",10);

			
			Example example2 = new Example(2,"exp2",20);

			
			Example example3 = new Example(3,"exp3",30);

			
			
			manager.getTransaction().begin();
			manager.persist(example1);
			manager.persist(example2);
			manager.persist(example3);
			manager.getTransaction().commit();
			
			
			TypedQuery<Example> query=  manager.createNamedQuery("Example.findAll",Example.class);
			List<Example> testDatas =   query.getResultList();
			
			for(Example data : testDatas) {
				
				System.out.println(data);
			}
			
			
			

		

	}

}
