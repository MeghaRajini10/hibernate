package com.alvas.otou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePerson {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction entityTransaction=em.getTransaction();
		
		
		Person person=em.find(Person.class,1);
		if(person!=null) {
			System.out.println(person);
		}
		else {
			System.out.println("No person found with given id");
		}
		

	}

}
