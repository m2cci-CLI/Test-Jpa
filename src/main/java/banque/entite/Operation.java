package banque.entite;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity @Inheritance(strategy=InheritanceType.JOINED)
@Table(name="operation" )
public abstract class Operation implements Serializable {
	@Id	@Column(name = "ID") @GeneratedValue
private int id;	
	@Column(name = "date")
private LocalDate date  ;
	@Column(name = "montant")
private double montant;
	@Column(name = "motif")
private String motif;
	
	
	@ManyToOne
	@JoinColumn(name="ID_o")
	private Compte compte;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public double getMontant() {
		return montant;
	}


	public void setMontant(double montant) {
		this.montant = montant;
	}


	public String getMotif() {
		return motif;
	}


	public void setMotif(String motif) {
		this.motif = motif;
	}


	public Compte getComptes() {
		return compte;
	}


	public void setComptes(Compte comptes) {
		this.compte = comptes;
	}


	public Operation(int id, LocalDate date, double montant, String motif, Compte comptes) {
		super();
		this.id = id;
		this.date = date;
		this.montant = montant;
		this.motif = motif;
		this.compte = comptes;
	}


	public Operation() {
		super();
	}
	
	
	
	
	
}
