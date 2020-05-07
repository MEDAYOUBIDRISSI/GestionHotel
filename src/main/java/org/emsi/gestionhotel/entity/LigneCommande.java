package org.emsi.gestionhotel.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommande {
	
	@EmbeddedId
	private LigneCmdKey idLigne;
	@JoinColumn(name = "commande", referencedColumnName = "id", insertable = false, updatable = false)
	@ManyToOne
	private Commande commande;
	@JoinColumn(name = "produit", referencedColumnName = "id", insertable = false, updatable = false)
	@ManyToOne
	private Produit produit;
	
	
	private int quantite;


	


	public LigneCommande(LigneCmdKey idLigne, Commande commande, Produit produit, int quantite) {
		super();
		this.idLigne = idLigne;
		this.commande = commande;
		this.produit = produit;
		this.quantite = quantite;
	}


	public LigneCmdKey getIdLigne() {
		return idLigne;
	}


	public void setIdLigne(LigneCmdKey idLigne) {
		this.idLigne = idLigne;
	}


	public Commande getCommande() {
		return commande;
	}


	public void setCommande(Commande commande) {
		this.commande = commande;
	}


	public Produit getProduit() {
		return produit;
	}


	public void setProduit(Produit produit) {
		this.produit = produit;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public LigneCommande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
