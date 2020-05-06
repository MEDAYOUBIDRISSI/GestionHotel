package org.emsi.gestionhotel.entity;

import java.util.List;

import javax.persistence.Entity;
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
	@OneToMany(mappedBy = "employe")
	private List<DateTache> dateTaches;
	
	// Type Tache
	@ManyToOne
	private TypeTache typeT;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<DateTache> getDateTaches() {
		return dateTaches;
	}

	public void setDateTaches(List<DateTache> dateTaches) {
		this.dateTaches = dateTaches;
	}

	public TypeTache getTypeT() {
		return typeT;
	}

	public void setTypeT(TypeTache typeT) {
		this.typeT = typeT;
	}

	public Tache(long id, String nom, String description, List<DateTache> dateTaches, TypeTache typeT) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.dateTaches = dateTaches;
		this.typeT = typeT;
	}

	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
