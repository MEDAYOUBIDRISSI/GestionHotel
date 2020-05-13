package org.emsi.gestionhotel.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

@Entity
public class CategorieChambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String libelle;
    @JsonIgnore
    @OneToMany(mappedBy = "categorieC")
    private List<Chambre> chambres;
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
	public List<Chambre> getChambres() {
		return chambres;
	}
	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}
    
    
}
