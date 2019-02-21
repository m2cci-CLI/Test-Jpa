package banque.entite;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.jpa.Emprunt;

@Entity
@Table(name="Banque" )
public class Banque {
@Id	@Column(name = "ID") @GeneratedValue	
private int id;	
@Column(name = "nom")
private String nom;

@OneToMany(mappedBy="banque")
private List<Client> clients;

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

public List<Client> getClients() {
	return clients;
}

public void setClients(List<Client> clients) {
	this.clients = clients;
}

public Banque(int id, String nom, List<Client> clients) {
	super();
	this.id = id;
	this.nom = nom;
	this.clients = clients;
}

public Banque() {
	super();
}













}
