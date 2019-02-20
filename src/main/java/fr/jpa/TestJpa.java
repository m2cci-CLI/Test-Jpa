package fr.jpa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_essai");
         EntityManager ETM= emf.createEntityManager();
	}

}
