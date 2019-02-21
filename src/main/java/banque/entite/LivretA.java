package banque.entite;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LivretA" )
public class LivretA extends Compte  {
	
	
	@Column(name = "taux")
private double taux;

	
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public LivretA(int id, String numero, Double solde, List<Client> client, List<banque.entite.Operation> operation,
			double taux) {
		super(id, numero, solde, client, operation);
		this.taux = taux;
	}
	public LivretA(int id, String numero, Double solde, List<Client> client, List<banque.entite.Operation> operation) {
		super(id, numero, solde, client, operation);
	}
	
	
	
	
	
	

}
