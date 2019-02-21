package banque.entite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.jpa.Livre;

public class TestImp {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
        Banque banque = new Banque();
            //creation banque
	        banque.setNom("societe-general");
	        //creation client
		  List<Client> listclient = new ArrayList<Client>();
	        Client clientjack = new Client();
	        clientjack.setNom("cherif");
	        clientjack.setPrenom("Jack");
	        clientjack.setBanques(banque);
	        clientjack.setDateNaissance(LocalDate.of(1987, 04, 17));
          //adresse 
	        Adresse adressejack = new Adresse();
	        adressejack.setNumero(5);
	        adressejack.setRue("rue de la Vilette");
	        adressejack.setCodePostal(69003);
	        adressejack.setVille("Lyon");
	        clientjack.setAdresse(adressejack);
	       listclient.add(clientjack);
	        //comptes
	        em.persist(banque); 
	        em.persist(clientjack);

		    transaction.commit();


	}

}
