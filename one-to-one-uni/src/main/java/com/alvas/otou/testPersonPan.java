package com.alvas.otou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class testPersonPan {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction entityTransaction=em.getTransaction();
		
		Pan pan=new Pan();
		pan.setAddress("sdcghhbhj");
		pan.setPanNumber("ADFCF46566");
		
		
		
		Person p=new Person();
		p.setAge(20);
		p.setName("megha");
		p.setEmail("megha@gmail.com");
		p.setPhone(5677);
		
		p.setPan(pan);
		
		
		
		entityTransaction.begin();
		em.persist(pan);
		em.persist(p);
		entityTransaction.commit();
		
		
	}

}
