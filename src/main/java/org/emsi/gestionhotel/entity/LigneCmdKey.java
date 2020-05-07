package org.emsi.gestionhotel.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LigneCmdKey implements Serializable{
	@Column(name="produit")
	private long produit;
	@Column(name="commande")
    private long commande;
	public long getProduit() {
		return produit;
	}
	public void setProduit(long produit) {
		this.produit = produit;
	}
	public long getCommande() {
		return commande;
	}
	public void setCommande(long commande) {
		this.commande = commande;
	}
	public LigneCmdKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LigneCmdKey(long produit, long commande) {
		super();
		this.produit = produit;
		this.commande = commande;
	}
	
	
    
    
}
