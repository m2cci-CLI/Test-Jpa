package fr.jpa;
import java.util.List;
import java.util.ListIterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class TestJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager ETM= emf.createEntityManager();


		Livre MONlIVRE = ETM.find(Livre.class, 1);

		if (MONlIVRE != null){
			System.out.println("BRAVO JE L'AI TROUVER ");
			System.out.println("Le résultat est = "+ MONlIVRE.getTitre());
		}
		if (MONlIVRE == null){
			System.out.println("desole je l'ai pas trouver donne moi un autre id ");
		}

		Query query = ETM.createQuery("select l from Livre l");
		Livre livreTitre = (Livre) query.getResultList().get(0);
		if (livreTitre != null){
			System.out.println("BRAVO JE L'AI TROUVER ");
			System.out.println("Le résultat est du titre = "+ livreTitre.getTitre());
		}
		if (livreTitre == null){
			System.out.println("desole je l'ai pas trouver donne moi un autre titre");
		}

		
		TypedQuery<Emprunt> reqemplivre = ETM.createQuery("select e from Emprunt e where e.id = 5", Emprunt.class);
        List<Emprunt> resultreqemplivre = reqemplivre.getResultList();
        for(Emprunt f : resultreqemplivre){
            List<Livre> bibliotheque = f.getLivres();
            for(Livre l : bibliotheque)
        System.out.println("l'auteur est " + l.getAuteur() + " et le titre : " + l.getTitre());    
        }
        
        
        TypedQuery<Client> eleClient = ETM.createQuery("select e from Client e where e.id = 3", Client.class);
        Client  resulte = eleClient.getSingleResult();
        for(Emprunt f : resulte.getEmprunts()){
            for(Livre l : f.getLivres()){
            	System.out.println("l'auteur est " + l.getAuteur() + " et le titre : " + l.getTitre()+ resulte.getEmprunts().size()); 
            }
           
        }
      
        
        
        

	}

}
