package banque.entite;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Virement" )
public class Virement extends Operation  {
	
	
	@Column(name = "beneficiare")
	private double beneficiare ;

	public double getBeneficiare() {
		return beneficiare;
	}
	public void setBeneficiare(double beneficiare) {
		this.beneficiare = beneficiare;
	}
	public Virement(int id, LocalDate date, double montant, String motif, Compte comptes, double beneficiare) {
		super(id, date, montant, motif, comptes);
		this.beneficiare = beneficiare;
	}
	public Virement(int id, LocalDate date, double montant, String motif, Compte comptes) {
		super(id, date, montant, motif, comptes);
	}

	
	public Virement() {
	
	}

	
	

}
