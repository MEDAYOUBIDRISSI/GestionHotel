package org.emsi.gestionhotel.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String libelle;
	private double prix;
	
	@OneToMany(mappedBy = "produit" , fetch=FetchType.EAGER)
	private List<LigneCommande> ligneCommandes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public List<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}

	public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	public Produit(long id, String libelle, double prix, List<LigneCommande> ligneCommandes) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		this.ligneCommandes = ligneCommandes;
	}

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
