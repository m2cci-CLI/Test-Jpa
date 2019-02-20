package fr.jpa;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emprunt")
public class Emprunt {
	@Id	@Column(name = "ID")
	private int idE;
	@Column(name = "DATE_DEBUT")
	private LocalDate date_debut  ;
	
	@Column(name = "DELAI")
	private int DELAI;
	@Column(name = "DATE_FIN")
	private LocalDate date_fin  ;
	
	  @ManyToOne
	   @JoinColumn(name="ID_CLIENT")
	   private Client clients; 
	
	  
		@ManyToMany
		@JoinTable(name="COMPO", 
		joinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID"),
		inverseJoinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID"))
		private List<Livre> livres;

	public List<Livre> getLivres() {
			return livres;
		}

		public void setLivres(List<Livre> livres) {
			this.livres = livres;
		}

	public int getIdE() {
		return idE;
	}

	public void setIdE(int idE) {
		this.idE = idE;
	}

	public LocalDate getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(LocalDate date_debut) {
		this.date_debut = date_debut;
	}

	public int getDELAI() {
		return DELAI;
	}

	public void setDELAI(int dELAI) {
		DELAI = dELAI;
	}

	public LocalDate getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(LocalDate date_fin) {
		this.date_fin = date_fin;
	}

	public Emprunt(int idE, LocalDate date_debut, int dELAI, LocalDate date_fin) {
		super();
		this.idE = idE;
		this.date_debut = date_debut;
		DELAI = dELAI;
		this.date_fin = date_fin;
	}

	public Emprunt() {
		super();
	}
	
	
	
	
	
	
}
