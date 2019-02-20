package fr.jpa;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="livre")
public class Livre {

	@Id	@Column(name = "ID")
	private int idl;
	@Column(name = "TITRE")
	private String titre;
	@Column(name = "AUTEUR")
	private String auteur;


	
	@ManyToMany(mappedBy="livres")
    private List<Emprunt> emprunts;
	
	
	

	public Livre(int idl, String titre, String auteur) {
		super();
		this.idl = idl;
		this.titre = titre;
		this.auteur = auteur;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Livre() {
	}

	public Livre(int idl) {
		super();
		this.idl = idl;
	}

	public int getidl() {
		return idl;
	}

	public void setidl(int idl) {
		this.idl = idl;
	}



}
