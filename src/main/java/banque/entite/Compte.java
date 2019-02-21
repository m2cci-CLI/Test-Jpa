package banque.entite;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity @Inheritance(strategy=InheritanceType.JOINED)
@Table(name="Compte" )

public abstract class  Compte   {
	@Id	@Column(name = "ID") @GeneratedValue
	private int id;	
	@Column(name = "numero")
	private String numero;
	@Column(name = "solde")
	private Double solde;
	
	@ManyToMany(mappedBy="comptes")
    private List<Client> client;
	
	@OneToMany(mappedBy="compte")
	private List<Operation> Operation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}

	public List<Operation> getOperation() {
		return Operation;
	}

	public void setOperation(List<Operation> operation) {
		Operation = operation;
	}

	public Compte(int id, String numero, Double solde, List<Client> client, List<banque.entite.Operation> operation) {
		super();
		this.id = id;
		this.numero = numero;
		this.solde = solde;
		this.client = client;
		Operation = operation;
	}

	public Compte() {
		
	}
	
	

	
	
}
