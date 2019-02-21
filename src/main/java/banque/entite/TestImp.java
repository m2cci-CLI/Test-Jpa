package banque.entite;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestImp {

	public static void main(String[] args) {
		
		Banque banque = new Banque();
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		banque.setId(0);
		banque.setNom("societe-general");
		em.persist(banque);
		transaction.commit();
		
		
		
		
		

	}

}
