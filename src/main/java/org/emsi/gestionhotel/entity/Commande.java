package org.emsi.gestionhotel.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String matricule;
	@OneToMany(mappedBy = "commande" , fetch=FetchType.EAGER)
	private List<LigneCommande> ligneCommandes;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public List<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}
	public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}
	public Commande(long id, String matricule, List<LigneCommande> ligneCommandes) {
		super();
		this.id = id;
		this.matricule = matricule;
		this.ligneCommandes = ligneCommandes;
	}
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
