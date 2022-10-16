package CompositeKey;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestValidateUser {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		
		String s="select u from User u where u.userId.email=?1 or u.userId.phone=?2 and u.password=?3";
		Query query =em.createQuery(s);
		query.setParameter(1, "megha@gmail.com");
		query.setParameter(2, "34567889");
		query.setParameter(3,"megha@01" );
		
		List<User> users=query.getResultList();
		if(users.size()>0) {
			User user=users.get(0);
			System.out.println(user);
		}
		else
		{
			System.out.println("Email or password wrong");
			
		}
		
		
		
		
		
		

	}

}
