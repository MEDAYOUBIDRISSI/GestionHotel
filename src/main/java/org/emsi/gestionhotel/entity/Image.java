package org.emsi.gestionhotel.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String url;
	
	// utilisateur
	@OneToOne(fetch = FetchType.LAZY)
	private Utilisateur utilisateur;
	// espace 
	@ManyToOne(fetch = FetchType.LAZY)
    private Espace espace;
	// produit 
	@ManyToOne(fetch = FetchType.LAZY)
	private Produit produit;
	
	
}
