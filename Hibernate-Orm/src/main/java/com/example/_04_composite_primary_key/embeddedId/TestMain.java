package com.example._04_composite_primary_key.embeddedId;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestMain {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");

		EntityManager manager = factory.createEntityManager();
		
		Employee employee = new Employee(1,"employeeName");
		Project project = new Project(1,"projectName");
		
		ParticipantId participantId = new ParticipantId(employee.getEmployeeId(), project.getProjectId());

		Participant participant = new Participant();
		participant.setParticipantId(participantId);
		participant.setRoleName("admin");

		

		manager.getTransaction().begin();
		manager.persist(employee);
		manager.persist(project);
		manager.getTransaction().commit();



		manager.getTransaction().begin();
		manager.persist(participant);
		manager.getTransaction().commit();
	    manager.close();
	}

}
