package org.emsi.gestionhotel.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class DateTache {
	
	
	@EmbeddedId
	private DateTacheKey id;
	@JoinColumn(name = "tache", referencedColumnName = "id", insertable = false, updatable = false)
	@ManyToOne
	private Tache tache;
	@JoinColumn(name = "employe", referencedColumnName = "id", insertable = false, updatable = false)
	@ManyToOne
	private Employe employe;	
	private String dureeTache;
	private Boolean etat;
	public DateTacheKey getId() {
		return id;
	}
	public void setId(DateTacheKey id) {
		this.id = id;
	}
	public Tache getTache() {
		return tache;
	}
	public void setTache(Tache tache) {
		this.tache = tache;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public String getDureeTache() {
		return dureeTache;
	}
	public void setDureeTache(String dureeTache) {
		this.dureeTache = dureeTache;
	}
	public Boolean getEtat() {
		return etat;
	}
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}
	public DateTache(DateTacheKey id, Tache tache, Employe employe, String dureeTache, Boolean etat) {
		super();
		this.id = id;
		this.tache = tache;
		this.employe = employe;
		this.dureeTache = dureeTache;
		this.etat = etat;
	}
	public DateTache() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
