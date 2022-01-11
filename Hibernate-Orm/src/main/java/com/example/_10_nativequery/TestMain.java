package com.example._10_nativequery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

public class TestMain {

	public static void main(String[] args) {
		
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
			
			EntityManager manager = factory.createEntityManager();
		
		
			Metamodel metaModel = manager.getMetamodel();
			EntityType<Example> getModel = metaModel.entity(Example.class);
			
			for(Attribute<?, ?> attributes :getModel.getAttributes() ) {
				System.out.println(attributes.getName() +"-"+ attributes.getJavaType() +"\n");
				
			}
			
			
			manager.close();
			

		

	}

}
