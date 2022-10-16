package CompositeKey;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveUser {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		UserId userId =new UserId();
		userId.setEmail("megha2gmail.com");
		userId.setPhone("34567889");
		
		User user=new User();
		user.setName("megha");
		user.setAge(20);
		user.setPassword("megha@01");
		user.setUserId(userId);
		
		et.begin();
		em.persist(user);
		et.commit();
		
		System.out.println("Done");
		
		

	}

}
