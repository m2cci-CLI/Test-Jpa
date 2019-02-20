package fr.jpa;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="client" )
public class Client {
	@Id	@Column(name = "ID")
	private int idc;
	@Column(name = "NOM")
    private String nom;
	@Column(name = "PRENOM")
    private String prenom;
    
    @OneToMany(mappedBy="clients")
    private List<Emprunt> emprunts;
    
	public int getIdc() {
		return idc;
	}
	public void setIdc(int idc) {
		this.idc = idc;
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
	public Client(int idc, String nom, String prenom) {
		super();
		this.idc = idc;
		this.nom = nom;
		this.prenom = prenom;
	}
	public Client() {
		super();
	}
    
    

}
