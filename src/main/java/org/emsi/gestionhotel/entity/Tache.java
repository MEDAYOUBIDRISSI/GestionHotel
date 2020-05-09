package org.emsi.gestionhotel.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Tache {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String description;
	@OneToMany(mappedBy = "tache")
	private List<DateTache> dateTaches;
	
	// Type Tâche
	@ManyToOne(fetch = FetchType.LAZY)
	private TypeTache typeTache;

	
	
	
}
