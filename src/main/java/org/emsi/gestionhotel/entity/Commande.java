package org.emsi.gestionhotel.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	// ligne Commande
	@OneToMany(mappedBy = "commande", cascade = CascadeType.ALL)
	private Set<LigneCmd> ligneCmds = new HashSet<>();
	
	// reservation
	@OneToOne(mappedBy = "commande")
	private Reservation reservation;
}
