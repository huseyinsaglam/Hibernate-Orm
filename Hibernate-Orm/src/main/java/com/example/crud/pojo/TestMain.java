package com.example.crud.pojo;

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
		
		List<TestData> testDatas = new ArrayList();
		
		try {
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
			
			EntityManager manager = factory.createEntityManager();
		
			
//			TestData testData = new TestData();
//			testData.setDataName("hsaglam");
//			testData.setDataValue(10.000);
//			
//			
//			manager.getTransaction().begin();
//			manager.persist(testData);
//			manager.getTransaction().commit();
//			System.out.println(testData);
			
//			TestData data = manager.find(TestData.class, 1L);
//			data.setDataName("test deneme");
//			manager.getTransaction().begin();
//			manager.merge(data);
//			manager.getTransaction().commit();
//			
//			System.out.println(data);
//			
//			TestData data2 = manager.find(TestData.class, 1L);
//			manager.getTransaction().begin();
//			manager.remove(data2);
//			manager.getTransaction().commit();
//			manager.close();
			
			// String jpql = "select data from TestData data where data.dataValue>20.0";
			String jpql = "select data from TestData data where data.dataValue>:minValue";
			Query query = manager.createQuery(jpql);
			query.setParameter("minValue", 60);
			
			testDatas = query.getResultList();
			// TestData tesData = (TestData) query.getSingleResult();
			// System.out.println(tesData);
			

		} catch (Exception e) {
			testDatas = null;
		}
		
	   if (testDatas!= null) {
			for (TestData s : testDatas) {
				System.out.println(s);
			}
	   } else {
		   System.out.println("hiç urun yok");
	   }
		

	}

}
