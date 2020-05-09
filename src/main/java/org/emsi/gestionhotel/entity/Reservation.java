package org.emsi.gestionhotel.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservation {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebut;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFin;
	private Boolean etat;
	
	
	// Tables
	@ManyToMany
	private List<Table> tables;
	
	// Espace
	@ManyToOne(fetch = FetchType.LAZY)
	private Espace espace;
	
	// receptionniste
	@ManyToOne(fetch = FetchType.LAZY)
    private Receptionniste receptionniste;
	
	// Serveur
	
	@ManyToOne(fetch = FetchType.LAZY)
    private Serveur serveur;
	
	// Client
	@ManyToOne(fetch = FetchType.LAZY)
	private Client client;
	
	// Facturation 
	@OneToOne(mappedBy = "reservation")
    private Facturation facturation;
	
	
	// Commande
	@OneToOne(fetch = FetchType.LAZY)
	private Commande commande;
	
}
