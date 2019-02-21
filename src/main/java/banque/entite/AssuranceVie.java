package banque.entite;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AssuranceVie" )
public class AssuranceVie extends Compte {
	
	
	@Column(name = "dateFin")
	private LocalDate dateFin;
	@Column(name = "taux")
	private double taux ;
	
	public LocalDate getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public AssuranceVie(int id, String numero, Double solde, List<Client> client,
			List<banque.entite.Operation> operation, LocalDate dateFin, double taux) {
		super(id, numero, solde, client, operation);
		this.dateFin = dateFin;
		this.taux = taux;
	}
	public AssuranceVie(int id, String numero, Double solde, List<Client> client,
			List<banque.entite.Operation> operation) {
		super(id, numero, solde, client, operation);
	}
	
	
	
	

}
