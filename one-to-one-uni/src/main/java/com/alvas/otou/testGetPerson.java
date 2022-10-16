package com.alvas.otou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowSysOut;

public class testGetPerson {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		
		
		Person person=em.find(Person.class,1);
		if(person!=null) {
			System.out.println(person);
		}
		else
		{
			System.out.println("No person found with given id");
		}

	}

}
