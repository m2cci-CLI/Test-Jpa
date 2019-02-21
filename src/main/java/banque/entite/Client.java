package banque.entite;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.jpa.Livre;



@Entity
@Table(name="Client" )
public class Client {
@Id	@Column(name = "ID") @GeneratedValue
private int id;	
@Column(name = "nom")	
private String nom;
@Column(name = "prenom")
private String prenom;
@Column(name = "dateNaissance")
private LocalDate dateNaissance ;
	



@Embedded
private Adresse adresse;

public Adresse getAdresse() {
	return adresse;
}


public void setAdresse(Adresse adresse) {
	this.adresse = adresse;
}


public Banque getBanque() {
	return banque;
}


public void setBanque(Banque banque) {
	this.banque = banque;
}


@ManyToOne
@JoinColumn(name="ID_c")
private Banque banque; 


@ManyToMany
@JoinTable(name="COMPO", 
joinColumns= @JoinColumn(name="ID_CLI", referencedColumnName="ID"),
inverseJoinColumns= @JoinColumn(name="ID_COM", referencedColumnName="ID"))
private List<Compte> comptes;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getPrenom() {
	return prenom;
}


public void setPrenom(String prenom) {
	this.prenom = prenom;
}


public LocalDate getDateNaissance() {
	return dateNaissance;
}


public void setDateNaissance(LocalDate dateNaissance) {
	this.dateNaissance = dateNaissance;
}


public Banque getBanques() {
	return banque;
}


public void setBanques(Banque banque) {
	this.banque = banque;
}


public List<Compte> getComptes() {
	return comptes;
}


public void setComptes(List<Compte> comptes) {
	this.comptes = comptes;
}


public Client(int id, String nom, String prenom, LocalDate dateNaissance, Banque banques, List<Compte> comptes) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.dateNaissance = dateNaissance;
	this.banque = banque;
	this.comptes = comptes;
}


public Client() {
	super();
}









}
	

